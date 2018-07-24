package fantasy.service;

import fantasy.model.User;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserService {

    void create(String email, String password);
        Set<User> findAll();

}

