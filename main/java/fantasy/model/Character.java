package fantasy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Character {
    @Id
    @GeneratedValue
    private Long id;

    private User user;
    private String description;



}
