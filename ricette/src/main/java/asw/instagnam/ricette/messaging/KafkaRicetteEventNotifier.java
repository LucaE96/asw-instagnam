package asw.instagnam.ricette.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import asw.instagnam.api.events.ricette.RicetteEvent;
import asw.instagnam.api.messaging.ricette.RicetteEventChannels;

@Component
public class KafkaRicetteEventNotifier implements RicetteEventNotifier {
	
	private String channel = RicetteEventChannels.ricetteChannel;
	
	@Autowired
	private KafkaTemplate<String, RicetteEvent> template;
	
	@Override
	public void notify(RicetteEvent event) {
		this.template.send(channel, event);
	}
	
}
