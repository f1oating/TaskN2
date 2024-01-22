package by.toronchenko.taskn2.controller;

import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHome(){
        return "home";
    }

}
