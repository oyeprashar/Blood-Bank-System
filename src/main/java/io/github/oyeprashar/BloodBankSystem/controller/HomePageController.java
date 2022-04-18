package io.github.oyeprashar.BloodBankSystem.controller;

import FormHandling.User;
import io.github.oyeprashar.BloodBankSystem.grpcClient.GrpcClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomePageController {

    @GetMapping("/")
    public String loginForm(Model model) {
        model.addAttribute("user", new User());
        return "HomePage";
    }

    @PostMapping("/")
    public String verifyUser(@ModelAttribute User user, Model model) {

        model.addAttribute(user);

        Boolean isValid = GrpcClient.verifyPassword(user.getId(), user.getPassword());

        System.out.println("========== INSIDE POST ========");

        if (Boolean.TRUE.equals(isValid)) {
            return "WelcomePage";
        } else {
            return "Error";
        }
    }
}
