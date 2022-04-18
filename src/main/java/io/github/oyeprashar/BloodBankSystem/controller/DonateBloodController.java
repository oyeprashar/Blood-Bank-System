package io.github.oyeprashar.BloodBankSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DonateBloodController {

    @GetMapping("/donate")
    public String donate(){return "DonateBlood.html";}

}