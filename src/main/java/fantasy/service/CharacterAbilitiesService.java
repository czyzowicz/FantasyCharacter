package fantasy.service;


import fantasy.model.CharacterAbilities;
import fantasy.model.PhysicalAbilites;
import fantasy.model.PsychicAbilities;
import fantasy.model.SpecialAbilities;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CharacterAbilitiesService {

    void create(PhysicalAbilites physicalAbilites, PsychicAbilities psychicAbilities, SpecialAbilities specialAbilities);
    Set<CharacterAbilities> findAllByPhysicalAbilities(PhysicalAbilites physicalAbilites);
    Set<CharacterAbilities> findAllByPsychicalAbilities(PsychicAbilities psychicAbilities);
    Set<CharacterAbilities> findAllBySpecialAbilities(SpecialAbilities specialAbilities);


}
