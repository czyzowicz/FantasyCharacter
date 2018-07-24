package fantasy.repository;


import fantasy.model.Character;
import fantasy.model.CharacterRaseAndClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CharacterRepository extends CrudRepository<Character, Long> {

    Set<Character> findAllByName(String name);
    Set<Character> findAll();
    Set<Character> findAllByCharacterRaseAndClass(CharacterRaseAndClass characterRaseAndClass);
}
