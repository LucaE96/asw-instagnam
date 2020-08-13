package asw.instagnam.ricetteseguite.domain;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface RicetteSeguiteRepository extends CrudRepository<RicettaSeguita, RicettaSeguitaCompositeKey> {

	public Collection<RicettaSeguita> findAllByUtenteFollower(String utenteFollower); 

}

