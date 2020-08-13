package asw.instagnam.ricetteseguite.domain;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface RicetteRepository extends CrudRepository<Ricetta, Long> {

	public Collection<Ricetta> findAllByAutore(String autore); 

}

