package fantasy.service;

import fantasy.model.Character;
import fantasy.model.CharacterAbilities;
import fantasy.model.CharacterRaseUndClass;
import fantasy.model.User;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CharacterService {

    void create (User user, String description,String name,CharacterAbilities characterAbilities,CharacterRaseUndClass characterRaseUndClass);
    Set<Character> findAllByName(String name);
    Set<Character> findAll();
    Set<Character> findAllByCharacterRaseAndClass(CharacterRaseUndClass characterRaseUndClass);
}
