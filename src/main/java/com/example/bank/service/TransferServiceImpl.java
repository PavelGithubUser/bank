package com.example.bank.service;

import com.example.bank.entity.Customer;
import com.example.bank.model.TransferModel;
import com.example.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransferServiceImpl implements TransferService{


    @Autowired
    CustomerRepository customerRepository;

    public void tranfer(TransferModel transferModel) {
        Customer fromCustomer = customerRepository.getByAccount(transferModel.getFromAccaunt());
        Customer toCustomer = customerRepository.getByAccount(transferModel.getToAccaunt());
        fromCustomer.setAmount(fromCustomer.getAmount() - transferModel.getAmountTransfer());
        customerRepository.save(fromCustomer);
        toCustomer.setAmount(toCustomer.getAmount() + transferModel.getAmountTransfer());
        customerRepository.save(toCustomer);
    }

}
