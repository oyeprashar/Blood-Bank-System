package io.github.oyeprashar.BloodBankSystem.controller;

import FormHandling.FindForm;
import FormHandling.RecordForm;
import farm.nurture.farm.service.proto.FindBloodResponseRecord;
import io.github.oyeprashar.BloodBankSystem.grpcClient.GrpcClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FindBloodController {

    @GetMapping("/find")
    public String findBlood(Model model) {
        model.addAttribute("findForm", new FindForm());
        return "GetBlood";
    }
    @PostMapping("/displayRecord")
    public String displayRecord(@ModelAttribute FindForm findForm, Model model){
        List<FindBloodResponseRecord> recordList = GrpcClient.getBloodRecord(findForm.getLocation(), findForm.getBloodType());
        model.addAttribute(findForm);
        model.addAttribute("recordList",recordList);
        return "DisplayRecords";
    }
}