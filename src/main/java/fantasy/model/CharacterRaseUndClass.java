package fantasy.model;

public enum CharacterRaseUndClass {
    DWARF_WARRIOR("DWARF", "WARRIOR"),
    DWARF_CLERIC ("DWARF", "CLERIC"),
    ELF_MAGE ("ELF" , "MAGE"),
    ELF_RANGER("ELF", "RANGER"),
    HALFING_ROUGE("HALFING", "ROUGE"),
    HUMAN_CLERIC("HUMAN", "CLERIC"),
    HUMAN_WARRIOR("HUMAN", "WARRIOR"),
    HUMAN_MAGE("HUMAN", "MAGE"),
    HUMAN_ROUGE("HUMAN", "ROUGE"),
    HUMAN_RANGER("HUMAN", "RANGER");

    private String rase;
    private String clazz;

    CharacterRaseUndClass(String rase, String clazz) {
        this.rase = rase;
        this.clazz = clazz;
    }

    public String getRase() {
        return rase;
    }

    public String getClazz() {
        return clazz;
    }
}
