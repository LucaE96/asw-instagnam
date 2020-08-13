package asw.instagnam.ricette.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class RicettaCompletaCompositeKey implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String autore;
	private String titolo;
	
}
