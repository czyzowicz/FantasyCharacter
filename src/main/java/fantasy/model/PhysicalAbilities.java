package fantasy.model;

public enum PhysicalAbilities {
    STRENGTH ("STRENGTH"),
    SPEED ("SPEED"),
    AGILITY ("AGILITY"),
    ENDURANCE ("ENDURANCE"),
    VITALITY ("VITALITY"),
    SWORD_AND_DAGGER_FIGHT ("SWORD AND DAGGER FIGHT"),
    SWORD_AND_SHIELD_FIGHT ("SWORD AND SHIELD FIGHT"),
    AXE_AND_HAMMER_FIGHT ("AXE AND HAMMER FIGHT"),
    DISTANCE_FIGHT ("DISTANCE  FIGHT"),
    THIEF_SKILLS ("THIEF SKILLS");

    private String physicalAbilities;

    PhysicalAbilities(String physicalAbilities) {
        this.physicalAbilities = physicalAbilities;
    }

    public String getPhysicalAbilities() {
        return physicalAbilities;
    }

    public void setPhysicalAbilities(String physicalAbilities) {
        this.physicalAbilities = physicalAbilities;
    }
}
