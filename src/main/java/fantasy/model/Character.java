package fantasy.model;

import javax.persistence.*;

@Entity
public class Character {

    @Id
    @GeneratedValue
    private Long id;
    private User user;
    private String description;
    private CharacterAbilities characterAbilities;

    public CharacterAbilities getCharacterAbilities() {
        return characterAbilities;
    }

    public void setCharacterAbilities(CharacterAbilities characterAbilities) {
        this.characterAbilities = characterAbilities;
    }

    public CharacterRaseAndClass getCharacterRaseAndClass() {
        return characterRaseAndClass;
    }

    public void setCharacterRaseAndClass(CharacterRaseAndClass characterRaseAndClass) {
        this.characterRaseAndClass = characterRaseAndClass;
    }

    @Enumerated(EnumType.STRING)
    private CharacterRaseAndClass characterRaseAndClass;

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
