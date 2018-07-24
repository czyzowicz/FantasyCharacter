package fantasy.repository;


import fantasy.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findOneByLogin(String login);
}
