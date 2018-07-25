package fantasy.controller;

import fantasy.model.User;
import fantasy.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;
    @GetMapping
    Set<User> findAll(String email){
        return  userService.findAll(email);
    }
}