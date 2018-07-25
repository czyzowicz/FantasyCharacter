package fantasy.service.impl;

import fantasy.model.Character;
import fantasy.model.CharacterAbilities;
import fantasy.model.CharacterRaseAndClass;
import fantasy.model.User;
import fantasy.service.CharacterService;

import java.util.Set;

public class CharacterServiceImpl implements CharacterService {

    @Override
    public void create(User user, String description, String name, CharacterAbilities characterAbilities, CharacterRaseAndClass characterRaseAndClass) {


    }

    @Override
    public Set<Character> findAllByName(String name) {
        return null;
    }

    @Override
    public Set<Character> findAll() {
        return null;
    }

    @Override
    public Set<Character> findAllByCharacterRaseAndClass(CharacterRaseAndClass characterRaseAndClass) {
        return null;
    }

}
