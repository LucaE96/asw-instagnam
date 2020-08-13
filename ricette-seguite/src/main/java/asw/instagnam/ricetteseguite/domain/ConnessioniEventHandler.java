package asw.instagnam.ricetteseguite.domain;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asw.instagnam.api.events.connessioni.ConnessioneCreataEvent;
import asw.instagnam.api.events.connessioni.ConnessioniEvent;

@Service
public class ConnessioniEventHandler {
	
	private final Logger logger = Logger.getLogger(ConnessioniEventHandler.class.toString());

	@Autowired
	private ConnessioniService connessioniService;
	
	@Autowired
	private RicetteSeguiteService ricetteSeguiteService;

	public void handle(ConnessioniEvent event) {
		logger.info("Received event: " + event);
		if (event.getClass().equals(ConnessioneCreataEvent.class)) {
			ConnessioneCreataEvent handledEvent = (ConnessioneCreataEvent) event;
			this.creaConnessione(handledEvent);
		} else {
			logger.warning("Unable to handle received event: " + event);			
		}
	}
	
	private void creaConnessione(ConnessioneCreataEvent event) {
		Connessione connessione = new Connessione(event);
		connessione = connessioniService.saveConnessione(connessione);
		ricetteSeguiteService.updateAfterNewConnessione(connessione);
	}

}
