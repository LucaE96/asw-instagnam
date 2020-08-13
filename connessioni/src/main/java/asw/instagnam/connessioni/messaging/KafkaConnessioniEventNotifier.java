package asw.instagnam.connessioni.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import asw.instagnam.api.events.connessioni.ConnessioniEvent;
import asw.instagnam.api.messaging.connessioni.ConnessioniEventChannels;

@Component
public class KafkaConnessioniEventNotifier implements ConnessioniEventNotifier {
	
	private String topic = ConnessioniEventChannels.connessioniChannel;
	
	@Autowired
	private KafkaTemplate<String, ConnessioniEvent> template;
	
	@Override
	public void notify(ConnessioniEvent event) {
		this.template.send(topic, event);
	}
	
}
