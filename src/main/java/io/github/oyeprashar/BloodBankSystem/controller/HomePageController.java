package io.github.oyeprashar.BloodBankSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping("/")
    public String index() {
        return "HomePage";
    }
}

