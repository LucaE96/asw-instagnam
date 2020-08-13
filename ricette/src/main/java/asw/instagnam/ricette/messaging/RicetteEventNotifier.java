package asw.instagnam.ricette.messaging;

import asw.instagnam.api.events.ricette.RicetteEvent;

public interface RicetteEventNotifier {
	
	public void notify(RicetteEvent event);
	
}
