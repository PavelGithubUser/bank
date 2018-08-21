package com.example.bank.service;

import com.example.bank.model.TransferModel;
import com.example.bank.model.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService {

    @Autowired
    CustomerService customerService;

    @Override
    public ValidationResult getValidationResult(BindingResult bindingResult, TransferModel transferModel) {
        List<String> messages = new ArrayList<>();
        if (bindingResult.hasErrors()) {
            putMessageErrorToList(bindingResult, messages);
            return new ValidationResult(messages, false);
        }
        if (!customerService.isEnough(transferModel.getFromAccount(), transferModel.getAmountTransfer())) {
            messages.add("Insufficient funds in the Sender's account");
            return new ValidationResult(messages, false);
        }
        messages.add("Successful transfer");
        return new ValidationResult(messages, true);
    }

    private void putMessageErrorToList(BindingResult bindingResult, List<String> messages) {
        bindingResult.getAllErrors();
        for (Object object : bindingResult.getAllErrors()) {
            if (object instanceof FieldError) {
                FieldError fieldError = (FieldError) object;
                messages.add(fieldError.getDefaultMessage());
            }
        }
    }

}
