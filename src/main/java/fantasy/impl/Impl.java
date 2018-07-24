package fantasy.impl;

import javax.servlet.annotation.WebListener;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

@WebListener
public class Impl {

    private Set<String> psychic_abilities() {
        return new TreeSet<>(Arrays.asList(("wisdom, charisma, inteligence")
                .split(",")));
    }
    private Set<String> phisical_abilities() {
        return new TreeSet<>(Arrays.asList(("strenght, speed, agility")
                .split(",")));
    }
    private Set<String> specjal_abilities() {
        return new TreeSet<>(Arrays.asList(("dark vision, mind controll, luck")
                .split(",")));
    }
}
