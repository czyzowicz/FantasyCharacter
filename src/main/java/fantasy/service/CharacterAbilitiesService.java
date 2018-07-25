package fantasy.service;


import fantasy.model.CharacterAbilities;
import fantasy.model.PhysicalAbilities;
import fantasy.model.PsychicAbilities;
import fantasy.model.SpecialAbilities;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CharacterAbilitiesService {

    void create(PhysicalAbilities physicalAbilities, PsychicAbilities psychicAbilities, SpecialAbilities specialAbilities);
    Set<CharacterAbilities> findAllByPhysicalAbilities(PhysicalAbilities physicalAbilities);
    Set<CharacterAbilities> findAllByPsychicalAbilities(PsychicAbilities psychicAbilities);
    Set<CharacterAbilities> findAllBySpecialAbilities(SpecialAbilities specialAbilities);


}
