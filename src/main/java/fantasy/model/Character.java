package fantasy.model;

import javax.persistence.*;

@Entity
public class Character {

    @Id
    @GeneratedValue
    private Long id;
    private User user;
    private String description;
    private String name;
    private CharacterAbilities characterAbilities;

    @Enumerated(EnumType.STRING)
    private CharacterRaseAndClass characterRaseAndClass;
    public CharacterRaseAndClass getCharacterRaseAndClass() {
        return characterRaseAndClass;
    }

    public CharacterAbilities getCharacterAbilities() {
        return characterAbilities;
    }

    public void setCharacterRaseAndClass(CharacterRaseAndClass characterRaseAndClass) {
        this.characterRaseAndClass = characterRaseAndClass;
    }

    public void setCharacterAbilities(CharacterAbilities characterAbilities) {
        this.characterAbilities = characterAbilities;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
