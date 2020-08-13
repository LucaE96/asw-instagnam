package asw.instagnam.ricette.domain;

import javax.persistence.*; 

import lombok.*; 

/* Ricetta, in formato completo. */ 
@Entity 
@Table(uniqueConstraints=@UniqueConstraint(columnNames = {"autore", "titolo"}))
@Data @NoArgsConstructor
public class RicettaCompleta {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(nullable=false)
	private String autore; 
	
	@Column(nullable=false)
	private String titolo; 
	
	private String preparazione; 
	
	public RicettaCompleta(String autore, String titolo, String preparazione) {
		this(); 
		this.autore = autore; 
		this.titolo = titolo; 
		this.preparazione = preparazione; 
	}
	
}
