package fantasy.servis.impl;

import fantasy.model.CharacterAbilities;
import fantasy.model.CharacterRaseAndClass;
import fantasy.model.User;
import fantasy.servis.CharacterService;

import java.util.Set;

public class CharacterServiceImpl implements CharacterService {

    @Override
    public void create(User user, String description, String name, CharacterAbilities characterAbilities, CharacterRaseAndClass characterRaseAndClass) {

    }

    @Override
    public Set<Character> findAllBy() {
        return null;
    }
}
