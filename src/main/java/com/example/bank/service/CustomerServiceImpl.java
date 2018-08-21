package com.example.bank.service;

import com.example.bank.entity.Customer;
import com.example.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @Override
    public boolean isExist(String account){
        return customerRepository.existsByAccount(account);
    }

    @Override
    public boolean isEnough(String account, double amount){
        return customerRepository.isEnough(account, amount);
    }

    @Override
    public Customer gerCustomerByID (long id){
        return customerRepository.getOne(id);
    }

    @Override
    public Customer getByAccount(String account){
        return customerRepository.getByAccount(account);
    }

}
