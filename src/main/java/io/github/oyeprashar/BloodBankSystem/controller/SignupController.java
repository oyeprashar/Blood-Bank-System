package io.github.oyeprashar.BloodBankSystem.controller;

import FormHandling.RecordForm;
import FormHandling.SignupForm;
import io.github.oyeprashar.BloodBankSystem.grpcClient.GrpcClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {

    @GetMapping("/signup")
    public String signupUser(Model model){
        model.addAttribute("signupForm", new SignupForm());
        return "SignupForm";
    }

    @PostMapping("/signup")
    public String addEntry(@ModelAttribute SignupForm signupForm, Model model){
        model.addAttribute(signupForm);
        GrpcClient.signup(signupForm.getId(),signupForm.getPassword());
        return "redirect:/";
    }
}
