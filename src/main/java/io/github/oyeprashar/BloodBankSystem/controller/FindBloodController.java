package io.github.oyeprashar.BloodBankSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FindBloodController {

    @GetMapping("/find")
    public String findBlood() {
        return "GetBlood";
    }

}