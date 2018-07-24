package fantasy.model;

public enum SpecialAbilities {
    DARK_VISION ("DARK VISION"),
    LUCK ("LUCK"),
    QUICK_LEARN ("QUICK LEARN"),
    PSIONIC ("PSIONIC"),
    CLERIC_SPELLS ("CLERIC SPELLS"),
    MAGE_SPELLS ("MAGE SPELLS"),
    NECROMANT_SPELLS ("NECROMANT SPELLS"),
    RESISTANCE ("RESISTANCE"),
    MUTATION ("MUTATION"),
    DOGDE ("DOGDE");

    private String specialAbilities;

    public String getSpecialAbilities() {
        return specialAbilities;
    }

    public void setSpecialAbilities(String specialAbilities) {
        this.specialAbilities = specialAbilities;
    }

    SpecialAbilities(String specialAbilities) {

        this.specialAbilities = specialAbilities;
    }
}
