package com.cuvette.bankingApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cuvette.bankingApplication.servise.BankService;


@Controller
public class BankController {
	
    @Autowired
    private BankService bankService;

    @GetMapping("/branches")
    public String showBranches(Model model) {
        model.addAttribute("bankName", bankService.getBankName());
        model.addAttribute("branches", bankService.getBranches());
        return "branches";
    }

    @GetMapping("/services")
    public String showServices(Model model) {
        model.addAttribute("bankName", bankService.getBankName());
        model.addAttribute("services", bankService.getServices());
        return "services";
    }

}
