package asw.instagnam.ricetteseguite.domain;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asw.instagnam.api.events.ricette.RicettaCreataEvent;
import asw.instagnam.api.events.ricette.RicetteEvent;

@Service
public class RicetteEventHandler {
	
	private final Logger logger = Logger.getLogger(RicetteEventHandler.class.toString());

	@Autowired
	private RicetteService ricetteService;
	
	@Autowired
	private RicetteSeguiteService ricetteSeguiteService;

	public void handle(RicetteEvent event) {
		logger.info("Received event: " + event);
		if (event.getClass().equals(RicettaCreataEvent.class)) {
			RicettaCreataEvent handledEvent = (RicettaCreataEvent) event;
			this.creaRicetta(handledEvent);
		} else {
			logger.warning("Unable to handle received event: " + event);			
		}
	}
	
	private void creaRicetta(RicettaCreataEvent event) {
		Ricetta ricetta = new Ricetta(event);
		ricetta = ricetteService.saveRicetta(ricetta);
		ricetteSeguiteService.updateAfterNewRicetta(ricetta);
	}

}
