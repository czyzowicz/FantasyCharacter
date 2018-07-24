package fantasy.servis;

import fantasy.model.CharacterAbilities;
import fantasy.model.CharacterRaseAndClass;
import fantasy.model.User;
import java.util.Set;

public interface CharacterService {

    void create (User user, String description,String name,CharacterAbilities characterAbilities,CharacterRaseAndClass characterRaseAndClass);
    Set<Character> findAllBy();
}
