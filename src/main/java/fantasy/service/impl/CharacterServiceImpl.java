package fantasy.service.impl;

import fantasy.model.Character;
import fantasy.model.CharacterAbilities;
import fantasy.model.CharacterRaseAndClass;
import fantasy.model.User;
import fantasy.repository.CharacterRepository;
import fantasy.service.CharacterService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CharacterServiceImpl implements CharacterService {

    private CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public void create(User user, String description, String name, CharacterAbilities characterAbilities, CharacterRaseAndClass characterRaseAndClass) {
        Character character = new Character();
        character.setUser(user);
        character.setName(name);
        character.setDescription(description);
        character.setCharacterAbilities(characterAbilities);
        character.setCharacterRaseAndClass(characterRaseAndClass);
        characterRepository.save(character);
    }

    @Override
    public Set<Character> findAllByName(String name) {
        return characterRepository.findAllByName(name);
    }

    @Override
    public Set<Character> findAll() {
        return characterRepository.findAll();
    }

    @Override
    public Set<Character> findAllByCharacterRaseAndClass(CharacterRaseAndClass characterRaseAndClass) {
        return characterRepository.findAllByCharacterRaseAndClass(characterRaseAndClass);
    }
}
