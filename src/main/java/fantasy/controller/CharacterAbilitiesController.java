package fantasy.controller;

import fantasy.model.CharacterAbilities;
import fantasy.model.PhysicalAbilities;
import fantasy.model.PsychicAbilities;
import fantasy.model.SpecialAbilities;
import fantasy.service.CharacterAbilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/character_abilities")
public class CharacterAbilitiesController {

    private CharacterAbilitiesService characterAbilitiesService;

    @Autowired
    public CharacterAbilitiesController(CharacterAbilitiesService characterAbilitiesService) {
        this.characterAbilitiesService = characterAbilitiesService;
    }



    @PostMapping
    public void create(@RequestParam SpecialAbilities specialAbilities,
                       @RequestParam PhysicalAbilities physicalAbilities,
                       @RequestParam PsychicAbilities psychicAbilities){
      characterAbilitiesService.create(physicalAbilities, psychicAbilities, specialAbilities);
    }

    @GetMapping("/special")
    Set<CharacterAbilities> findAllBySpecialAbilities(@PathVariable SpecialAbilities specialAbilities){
        return characterAbilitiesService.findAllBySpecialAbilities(specialAbilities);
    }

    @GetMapping("/physical")
    Set<CharacterAbilities> findAllByPhysicalAbilities(@PathVariable PhysicalAbilities physicalAbilities){
        return characterAbilitiesService.findAllByPhysicalAbilities(physicalAbilities);
    }

    @GetMapping("/psychic")
    Set<CharacterAbilities> findAllByPsychicAbilities(@PathVariable PsychicAbilities psychicAbilities){
        return characterAbilitiesService.findAllByPsychicalAbilities(psychicAbilities);
    }
}
