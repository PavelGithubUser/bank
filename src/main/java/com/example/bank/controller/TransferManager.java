package com.example.bank.controller;

import com.example.bank.entity.Customer;
import com.example.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class TransferManager {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/transferpage")
    public String transferPage(){
//        Customerrr customers = customerRepository.findById(1L).get();
//        Customer customer =
//        Customer customer = new Customer();
//        customer.setId(7L);
//        customer.setAccount("5050856352637845");
//        customer.setAmount(20000d);
//        customer.setBirthday("05-05-2000");
//        customer.setFirstname("jhbjbnm");
//        customer.setLastname("bknjkknkjn");
//
//
//        customerRepository.save(customer);
        Customer customerget = customerRepository.getOne(2L);
        String s = customerget.getFirstname();
        List<Customer> customers = customerRepository.findAll();
        return "transferpage";
    }

}
