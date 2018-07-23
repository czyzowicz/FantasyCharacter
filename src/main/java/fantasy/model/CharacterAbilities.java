package fantasy.model;

import javax.persistence.*;

@Entity
public class CharacterAbilities {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private SpecialAbilities specialAbilities;

    @Enumerated(EnumType.STRING)

    private PsychicAbilities psychicAbilities;

    @Enumerated(EnumType.STRING)
    private PhysicalAbilites physicalAbilites;

    public Long getId() {
        return id;
    }

    public SpecialAbilities getSpecialAbilities() {
        return specialAbilities;
    }

    public void setSpecialAbilities(SpecialAbilities specialAbilities) {
        this.specialAbilities = specialAbilities;
    }

    public PsychicAbilities getPsychicAbilities() {
        return psychicAbilities;
    }

    public void setPsychicAbilities(PsychicAbilities psychicAbilities) {
        this.psychicAbilities = psychicAbilities;
    }

    public PhysicalAbilites getPhysicalAbilites() {
        return physicalAbilites;
    }

    public void setPhysicalAbilites(PhysicalAbilites physicalAbilites) {
        this.physicalAbilites = physicalAbilites;
    }



}
