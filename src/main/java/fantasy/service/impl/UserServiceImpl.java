package fantasy.service.impl;

import fantasy.model.User;
import fantasy.repository.UserRepository;
import fantasy.service.UserService;

import java.util.Set;

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
    public Set<User> findAll(String email) {
        return userRepository.findOneByMail(email);
    }
}
