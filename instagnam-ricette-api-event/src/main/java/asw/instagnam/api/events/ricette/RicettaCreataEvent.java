package asw.instagnam.api.events.ricette;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class RicettaCreataEvent implements RicetteEvent {
	
	private Long id; 
	private String autore; 
	private String titolo; 
	
}
