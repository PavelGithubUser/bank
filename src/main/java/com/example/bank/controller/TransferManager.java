package com.example.bank.controller;

import com.example.bank.entity.Customer;
import com.example.bank.model.TransferModel;
import com.example.bank.repository.CustomerRepository;

import com.example.bank.service.CustomerService;
import com.example.bank.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TransferManager {

    @Autowired
    TransferService transferService;

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
        List<String> messages = new ArrayList<>();

        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors();
            for (Object object : bindingResult.getAllErrors()) {
                if (object instanceof FieldError) {
                    FieldError fieldError = (FieldError) object;
                    messages.add(fieldError.getDefaultMessage());
                }
            }
        } else if (!customerService.isExist(transferModel.getFromAccaunt())) {
            messages.add("Sender's account doesn't exist");
            if (!customerService.isExist(transferModel.getToAccaunt())){
                messages.add("Rrecipient's account doesn't exist");
            }
        } else if (!customerService.isEnough(transferModel.getFromAccaunt(), transferModel.getAmountTransfer())){
            messages.add("Insufficient funds in the Sender's account");
        } else {
            transferService.tranfer(transferModel);
            messages.add("Successful transfer");
        }

        modelAndView.setViewName("transferresult");
        modelAndView.addObject("messages", messages);
        return modelAndView;
    }

    @GetMapping("/customerlist")
    public String customerList(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customerlist";
    }

}
