package fantasy.repository;


import fantasy.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Set<User> findOneByEmail(String email);
}
