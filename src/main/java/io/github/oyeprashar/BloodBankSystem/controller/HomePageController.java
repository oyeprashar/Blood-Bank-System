package io.github.oyeprashar.BloodBankSystem.controller;

import FormHandling.User;
import io.github.oyeprashar.BloodBankSystem.grpcClient.GrpcClient;
import org.graalvm.compiler.nodes.java.LoadFieldNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomePageController {

    @GetMapping("/")
    public String loginForm(Model model) {
        model.addAttribute("message", "thyleaf is working!.");
        model.addAttribute("user", new User());
        return "HomePage";
    }

    @PostMapping("/")
    public String verifyUser(@ModelAttribute User user, Model model) {

        model.addAttribute(user);

//        return "redirect:/welcome";

        Boolean isValid = GrpcClient.verifyPassword(user.getId(), user.getPassword());

        System.out.println("========== INSIDE POST ========");

        if (Boolean.TRUE.equals(isValid)) {
            return "WelcomePage";
        } else {
            throw new NullPointerException();
        }
    }
}
