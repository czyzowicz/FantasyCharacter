package fantasy.controller;

import fantasy.model.CharacterAbilities;
import fantasy.model.PhysicalAbilites;
import fantasy.model.PsychicAbilities;
import fantasy.model.SpecialAbilities;
import fantasy.servis.CharacterAbilitiesService;
import groovy.util.logging.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.text.normalizer.CharTrie;

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
                       @RequestParam PhysicalAbilites physicalAbilites,
                       @RequestParam PsychicAbilities psychicAbilities){
      characterAbilitiesService.create(physicalAbilites, psychicAbilities, specialAbilities);
    }

    @GetMapping
    Set<CharacterAbilities> findAllBySpecialAbilities(@PathVariable SpecialAbilities specialAbilities){
        return characterAbilitiesService.findAllBySpecialAbilities(specialAbilities);
    }

    @GetMapping
    Set<CharacterAbilities> findAllByPhysicalAbilities(@PathVariable PhysicalAbilites physicalAbilites){
        return characterAbilitiesService.findAllByPhysicalAbilities(physicalAbilites);
    }

    @GetMapping
    Set<CharacterAbilities> findAllByPsychicAbilities(@PathVariable PsychicAbilities psychicAbilities){
        return characterAbilitiesService.findAllByPsychicalAbilities(psychicAbilities);
    }
}
