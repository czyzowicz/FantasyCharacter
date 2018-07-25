package fantasy.repository;

import fantasy.model.CharacterAbilities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CharacterAbilitiesRepository extends CrudRepository<Character, Long> {

    Set<CharacterAbilities> findAllBy();
}

