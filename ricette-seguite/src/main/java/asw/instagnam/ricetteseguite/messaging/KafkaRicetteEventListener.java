package asw.instagnam.ricetteseguite.messaging;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import asw.instagnam.api.events.ricette.RicetteEvent;
import asw.instagnam.api.messaging.ricette.RicetteEventChannels;
import asw.instagnam.ricetteseguite.domain.RicetteEventHandler;

@Component
public class KafkaRicetteEventListener {

	@Autowired
	private RicetteEventHandler ricetteEventHandler;
	
	@KafkaListener(topics=RicetteEventChannels.ricetteChannel)
	public void listen(ConsumerRecord<String,RicetteEvent> event) {
		RicetteEvent ricetteEvent = event.value();
		ricetteEventHandler.handle(ricetteEvent);
	}

}
