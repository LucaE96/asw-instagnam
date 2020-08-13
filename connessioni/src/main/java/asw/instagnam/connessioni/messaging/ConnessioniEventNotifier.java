package asw.instagnam.connessioni.messaging;

import asw.instagnam.api.events.connessioni.ConnessioniEvent;

public interface ConnessioniEventNotifier {
	
	public void notify(ConnessioniEvent event);
	
}
