package com.lab.excersises.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SignupController {
    @GetMapping("/signup")
    public String showSignupForm() {
        return "signup.html";
    }

    @PostMapping("/signup")
    public String submitSignupForm() {
        return "redirect:/home.html";
    }
}