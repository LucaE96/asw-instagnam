package asw.instagnam.ricetteseguite.domain;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 

@Service
@Transactional
public class RicetteService {

	@Autowired
	private RicetteRepository ricetteRepository;	
	
	public Ricetta saveRicetta(Ricetta ricetta) {
		ricetta = ricetteRepository.save(ricetta);
		return ricetta;
	}

	public Collection<Ricetta> getRicetteByAutore(String autore) {
		Collection<Ricetta> ricette = ricetteRepository.findAllByAutore(autore);
		return ricette;
	}
	
}