package fantasy.repository;

import fantasy.model.CharacterAbilities;
import fantasy.model.PhysicalAbilities;
import fantasy.model.PsychicAbilities;
import fantasy.model.SpecialAbilities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CharacterAbilitiesRepository extends CrudRepository<CharacterAbilities, Long> {

    Set<CharacterAbilities> findAllByPhysicalAbilities(PhysicalAbilities physicalAbilites);
    Set<CharacterAbilities> findAllByPsychicAbilities(PsychicAbilities psychicAbilities);
    Set<CharacterAbilities> findAllBySpecialAbilities(SpecialAbilities specialAbilities);
}

