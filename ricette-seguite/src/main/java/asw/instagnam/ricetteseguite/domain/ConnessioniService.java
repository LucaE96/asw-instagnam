package asw.instagnam.ricetteseguite.domain;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ConnessioniService {

	@Autowired
	private ConnessioniRepository connessioniRepository;	
	
	public Connessione saveConnessione(Connessione connessione) {
		connessione = connessioniRepository.save(connessione);
		return connessione;
	}

	public Collection<Connessione> getConnessioniByFollower(String follower) {
		Collection<Connessione> connessioni = connessioniRepository.findAllByFollower(follower);
		return connessioni;
	}
	
	public Collection<String> getFollowersOf(String followed) {
		Collection<Connessione> connessioni = connessioniRepository.findAllByFollowed(followed);
		List<String> followers = new ArrayList<String>();
		connessioni.parallelStream().forEach(connessione -> followers.add(connessione.getFollower()));
		return followers;
	}
	
}
