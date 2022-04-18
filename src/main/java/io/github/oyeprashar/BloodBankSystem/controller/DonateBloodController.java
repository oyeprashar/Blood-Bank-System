package io.github.oyeprashar.BloodBankSystem.controller;

import FormHandling.RecordForm;
import FormHandling.User;
import io.github.oyeprashar.BloodBankSystem.grpcClient.GrpcClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DonateBloodController {

    @GetMapping("/donate")
    public String donate(Model model) {
        model.addAttribute("recordForm", new RecordForm());
        return "DonateBlood";
    }

    @PostMapping("/donate")
    public String addEntry(@ModelAttribute RecordForm recordForm, Model model) {
        model.addAttribute(recordForm);
        GrpcClient.insertBloodRecord(recordForm.getName(),recordForm.getLocation(),recordForm.getBloodType(),recordForm.getGender(),recordForm.getPhoneNumber());
        model.addAttribute("recordForm", new RecordForm());
        return "DonateBlood";
    }
}