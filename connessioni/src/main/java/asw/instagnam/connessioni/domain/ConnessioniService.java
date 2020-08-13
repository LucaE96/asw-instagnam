package asw.instagnam.connessioni.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import asw.instagnam.api.events.connessioni.ConnessioneCreataEvent;
import asw.instagnam.connessioni.messaging.ConnessioniEventNotifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.*; 

@Service
@Transactional
public class ConnessioniService {

	@Autowired
	private ConnessioniRepository connessioniRepository;
	
	@Autowired
	@Qualifier("kafkaConnessioniEventNotifier")
	private ConnessioniEventNotifier notifier;

 	public Connessione createConnessione(String follower, String followed) {
		Connessione connessione = new Connessione(follower, followed); 
		connessione = connessioniRepository.save(connessione);
		notifier.notify(new ConnessioneCreataEvent(connessione.getId(), connessione.getFollower(), connessione.getFollowed()));
		return connessione;
	}

 	public Connessione getConnessione(Long id) {
		Connessione connessione = connessioniRepository.findById(id).orElse(null);
		return connessione;
	}

 	public Collection<Connessione> getConnessioni() {
		Collection<Connessione> connessioni = connessioniRepository.findAll();
		return connessioni;
	}

	public Collection<Connessione> getConnessioniByFollower(String follower) {
		Collection<Connessione> connessioni = connessioniRepository.findAllByFollower(follower);
		return connessioni;
	}

}
