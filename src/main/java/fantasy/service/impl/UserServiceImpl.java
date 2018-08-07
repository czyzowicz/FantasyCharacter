package fantasy.service.impl;

import fantasy.model.User;
import fantasy.repository.UserRepository;
import fantasy.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public void create(String email, String password) {
        User user = new User();
        user.setMail(email);
        user.setPassword(password);
        userRepository.save(user);
    }

    @Override
    public Set<User> findAll() {
        return userRepository.findAllBy();
    }
}
