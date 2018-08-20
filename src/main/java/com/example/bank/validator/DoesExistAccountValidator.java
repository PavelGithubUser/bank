package com.example.bank.validator;

import com.example.bank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DoesExistAccountValidator implements
        ConstraintValidator<DoesExist, String> {

    @Autowired
    CustomerService customerService;

    @Override
    public void initialize(DoesExist constraintAnnotation) {

    }

    @Override
    public boolean isValid(String account, ConstraintValidatorContext context) {
        if (customerService.isExist(account)){
            return true;
        }
        return false;
    }
}
