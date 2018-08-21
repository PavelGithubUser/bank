package com.example.bank.controller;

import com.example.bank.model.TransferModel;
import com.example.bank.model.ValidationResult;
import com.example.bank.service.CustomerService;
import com.example.bank.service.TransferService;
import com.example.bank.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class TransferManager {

    @Autowired
    TransferService transferService;

    @Autowired
    ValidationService validationService;

    @Autowired
    CustomerService customerService;

    @GetMapping("/transferpage")
    public String transferPage(Model model) {
        model.addAttribute("transfermodel", new TransferModel());
        return "transferpage";
    }

    @PostMapping("/transferpage")
    public ModelAndView transferPage(@Valid @ModelAttribute TransferModel transferModel,
                                     BindingResult bindingResult,
                                     ModelAndView modelAndView) {

        ValidationResult validationResult = validationService.getValidationResult(bindingResult, transferModel);

        if (validationResult.isValid()) {
            transferService.tranfer(transferModel);
        }

        modelAndView.setViewName("transferresult");
        modelAndView.addObject("messages", validationResult.getMessages());
        return modelAndView;

    }

    @GetMapping("/customerlist")
    public String customerList(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customerlist";
    }

}
