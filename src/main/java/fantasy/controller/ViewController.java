package fantasy.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping(value = {"", "/", "index.html"})
    public String home() {
        return "index";
    }


    @GetMapping("logging_success_page")
    public String loginSuccess(Model model) {
        model.addAttribute("mail", SecurityContextHolder.getContext().getAuthentication().getName());
        return "logging_success_page";
    }
}
