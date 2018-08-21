package com.example.bank.model;

import java.util.List;

public class ValidationResult {

    private List<String> messages;
    private boolean isValid;

    public ValidationResult(List<String> messages, boolean isValid) {
        this.messages = messages;
        this.isValid = isValid;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

}
