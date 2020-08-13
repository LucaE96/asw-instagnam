package asw.instagnam.ricetteseguite.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*; 

@Service 
@Transactional
public class RicetteSeguiteService {
	
	@Autowired
	private RicetteService ricetteService;
	
	@Autowired
	private ConnessioniService connessioniService;

	@Autowired 
	private RicetteSeguiteRepository ricetteSeguiteRepository;

	public RicettaSeguita createRicettaSeguita(String utenteFollower, Long idRicetta, String autoreRicetta, String titoloRicetta) {
		RicettaSeguita ricettaSeguita = new RicettaSeguita(utenteFollower, idRicetta, autoreRicetta, titoloRicetta); 
		ricettaSeguita = ricetteSeguiteRepository.save(ricettaSeguita);
		return ricettaSeguita;
	}
	
	public Collection<RicettaSeguita> getRicetteSeguiteByUtenteFollower(String utenteFollower) {
		Collection<RicettaSeguita> ricetteSeguite = ricetteSeguiteRepository.findAllByUtenteFollower(utenteFollower);
		return ricetteSeguite;
	}
	
	//TODO: do I actually want to transform RicettaSeguita in Ricetta?
	public Collection<Ricetta> getRicetteSeguite(String utente) {
		Collection<RicettaSeguita> ricetteSeguite = this.getRicetteSeguiteByUtenteFollower(utente);
		List<Ricetta> ricette = new ArrayList<Ricetta>();
		ricetteSeguite.parallelStream().forEach(ricettaSeguita -> ricette.add(new Ricetta(ricettaSeguita)));
		return ricette;
	}

	public void updateAfterNewRicetta(Ricetta ricetta) {
		// a new recipe has been created: anyone who follows the author should now follow the new recipe.
		Collection<String> followers = connessioniService.getFollowersOf(ricetta.getAutore());
		followers.parallelStream().forEach(follower -> ricetteSeguiteRepository.save(
				new RicettaSeguita(follower, ricetta.getId(), ricetta.getAutore(), ricetta.getTitolo())));
	}

	public void updateAfterNewConnessione(Connessione connessione) {
		// a new connection has been created: the follower should now follow all of the new followed's recipes.
		Collection<Ricetta> ricette = ricetteService.getRicetteByAutore(connessione.getFollowed());
		ricette.parallelStream().forEach(ricetta -> ricetteSeguiteRepository.save(
				new RicettaSeguita(connessione.getFollower(), ricetta.getId(), ricetta.getAutore(), ricetta.getTitolo())));
	}
	
}
