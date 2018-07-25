package fantasy.service.impl;

import fantasy.model.CharacterAbilities;
import fantasy.model.PhysicalAbilities;
import fantasy.model.PsychicAbilities;
import fantasy.model.SpecialAbilities;
import fantasy.repository.CharacterAbilitiesRepository;
import fantasy.service.CharacterAbilitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CharacterAbilitiesServiceImpl implements CharacterAbilitiesService {

    private CharacterAbilitiesRepository characterAbilitiesRepository;

    @Override
    public void create(PhysicalAbilities physicalAbilities, PsychicAbilities psychicAbilities, SpecialAbilities specialAbilities) {
        CharacterAbilities characterAbilities = new CharacterAbilities();
        characterAbilities.setPhysicalAbilities(physicalAbilities);
        characterAbilities.setPsychicAbilities(psychicAbilities);
        characterAbilities.setSpecialAbilities(specialAbilities);
        characterAbilitiesRepository.save(characterAbilities);
    }

    @Override
    public Set<CharacterAbilities> findAllByPhysicalAbilities(PhysicalAbilities physicalAbilities) {
        return null;
    }

    @Override
    public Set<CharacterAbilities> findAllByPsychicalAbilities(PsychicAbilities psychicAbilities) {
        return null;
    }

    @Override
    public Set<CharacterAbilities> findAllBySpecialAbilities(SpecialAbilities specialAbilities) {
        return null;
    }
}
