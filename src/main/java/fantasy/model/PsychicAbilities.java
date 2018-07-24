package fantasy.model;

public enum PsychicAbilities {
    CHARISMA ("CHARISMA"),
    WISDOM ("WISDOM"),
    INTELIGENCE ("INTELIGENCE"),
    STRENGTH_WILL ("STRENGTH_WILL"),
    OBSERVATION ("OBSERVATION"),
    LISTENING ("LISTENING"),
    DIPLOMACY ("DIPLOMACY"),
    BLEF ("BLEF"),
    SPEAKING_WITH_ANIMALS ("SPEAKING WITH ANIMALS"),
    READ_AND_WRITING ("READ AND WRITING");

    private String psychicAbilities;

    public String getPsychicAbilities() {
        return psychicAbilities;
    }

    public void setPsychicAbilities(String psychicAbilities) {
        this.psychicAbilities = psychicAbilities;
    }

    PsychicAbilities(String psychicAbilities) {

        this.psychicAbilities = psychicAbilities;
    }
}
