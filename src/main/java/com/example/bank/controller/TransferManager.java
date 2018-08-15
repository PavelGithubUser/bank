package com.example.bank.controller;

import com.example.bank.entity.Customer;
import com.example.bank.repository.CustomerRepository;
import com.example.bank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TransferManager {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/transferpage")
    public String transferPage(){
//        Customer customers = customerRepository.findById(1L).get();
        Customer customers = customerRepository.findById(2L).get();
        return "transferpage";
    }

}
