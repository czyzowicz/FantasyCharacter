package fantasy.repository;

import fantasy.model.PhysicalAbilites;
import fantasy.model.PsychicAbilities;
import fantasy.model.SpecialAbilities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterAbilitiesRepository extends CrudRepository<Character, Long> {

    void create(SpecialAbilities specjalAbilities,
                PsychicAbilities psychicAbilities,
                PhysicalAbilites physicalAbilites);
}

