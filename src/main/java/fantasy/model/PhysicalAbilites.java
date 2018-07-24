package fantasy.model;

public enum PhysicalAbilites {
    STRENGTH ("STRENGTH"),
    SPEED ("SPEED"),
    AGILITY ("AGILITY"),
    ENDURANCE ("ENDURANCE"),
    VITALITY ("VITALITY"),
    SWORD_AND_DAGGER_FIGHT ("SWORD AND DAGGER FIGHT"),
    SWORD_AND_SHIELD_FIGHT ("SWORD AND SHIELD FIGHT"),
    AXE_AND_HAMMER_FIGHT ("AXE AND HAMMER FIGHT"),
    DISTANCE_FIGHT ("DISTANCE  FIGHT"),
    TWO_WEAPONS_FIGHT ("TWO WEAPONS FIGHT");
    
    private String physicalAbilites;

    PhysicalAbilites(String physicalAbilites) {
        this.physicalAbilites = physicalAbilites;
    }

    public String getPhysicalAbilites() {
        return physicalAbilites;
    }

    public void setPhysicalAbilites(String physicalAbilites) {
        this.physicalAbilites = physicalAbilites;
    }
}
