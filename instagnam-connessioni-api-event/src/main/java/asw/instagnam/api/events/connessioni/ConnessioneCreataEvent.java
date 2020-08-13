package asw.instagnam.api.events.connessioni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ConnessioneCreataEvent implements ConnessioniEvent {
	
	private Long id;
	private String follower; 
	private String followed; 
	
}
