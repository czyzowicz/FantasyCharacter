package fantasy.repository;

import fantasy.model.CharacterAbilities;
import fantasy.model.PhysicalAbilites;
import fantasy.model.PsychicAbilities;
import fantasy.model.SpecialAbilities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CharacterAbilitiesRepository extends CrudRepository<CharacterAbilities, Long> {

    Set<CharacterAbilities> findAllByPhysicalAbilities(PhysicalAbilites physicalAbilites);
    Set<CharacterAbilities> findAllByPsychicalAbilities(PsychicAbilities psychicAbilities);
    Set<CharacterAbilities> findAllBySpecialAbilities(SpecialAbilities specialAbilities);
}

