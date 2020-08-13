package asw.instagnam.ricetteseguite.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@IdClass(RicettaSeguitaCompositeKey.class)
@Data @NoArgsConstructor @AllArgsConstructor
public class RicettaSeguita {
 
	@Id
	private String utenteFollower; 
	@Id
	private Long idRicetta;
	
	private String autoreRicetta;
	private String titoloRicetta;
	
}
