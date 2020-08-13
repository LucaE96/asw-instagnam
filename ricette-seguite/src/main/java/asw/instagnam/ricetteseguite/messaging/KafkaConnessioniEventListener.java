package asw.instagnam.ricetteseguite.messaging;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import asw.instagnam.api.events.connessioni.ConnessioniEvent;
import asw.instagnam.api.messaging.connessioni.ConnessioniEventChannels;
import asw.instagnam.ricetteseguite.domain.ConnessioniEventHandler;

@Component
public class KafkaConnessioniEventListener {

	@Autowired
	private ConnessioniEventHandler connessioniEventHandler;
	
	@KafkaListener(topics=ConnessioniEventChannels.connessioniChannel)
	public void listen(ConsumerRecord<String,ConnessioniEvent> event) {
		ConnessioniEvent connessioniEvent = event.value();
		connessioniEventHandler.handle(connessioniEvent);
	}

}