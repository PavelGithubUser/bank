package com.example.bank.controller;

import com.example.bank.entity.Customer;
import com.example.bank.model.TransferModel;
import com.example.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class TransferManager {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/transferpage")
    public String greetingForm(Model model) {
        model.addAttribute("transfermodel", new TransferModel());
        return "transferpage";
    }

    @PostMapping("/transferpage")
    public String transferPage(@ModelAttribute TransferModel transferModel){
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
        List<Customer> customers = customerRepository.findAll();
        Customer fromCustomer = customerRepository.getByAccount(transferModel.getFromAccaunt());
        Customer toCustomer = customerRepository.getByAccount(transferModel.getToAccaunt());
        fromCustomer.setAmount(fromCustomer.getAmount() - transferModel.getAmountTransfer());
        customerRepository.save(fromCustomer);
        toCustomer.setAmount(toCustomer.getAmount() + transferModel.getAmountTransfer());
        customerRepository.save(toCustomer);
        customers = customerRepository.findAll();
//        Customer customerupdate = customerRepository.getOne(2L);
//        double d2 = customerupdate.getAmount();

        return "transferpage";
    }

}
