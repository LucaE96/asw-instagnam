package asw.instagnam.connessioni.domain;

import javax.persistence.*;

import lombok.*; 

@Entity 
@Table(uniqueConstraints=@UniqueConstraint(columnNames = {"follower", "followed"}))
@Data @NoArgsConstructor
public class Connessione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String follower; 
	
	@Column(nullable=false)
	private String followed; 
	
	public Connessione(String follower, String followed) {
		this();
		this.follower = follower;
		this.followed = followed;
	}
	
}
