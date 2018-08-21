package com.example.bank.service;

import com.example.bank.model.TransferModel;
import com.example.bank.model.ValidationResult;
import org.springframework.validation.BindingResult;

public interface ValidationService {
    ValidationResult getValidationResult (BindingResult bindingResult, TransferModel transferModel);
}
