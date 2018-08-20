package com.example.bank.model;

import com.example.bank.validator.DoesExist;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class TransferModel {

    @DoesExist(message="Sender's account doesn't exist")
    @NotNull(message="Field Sender's account is empty")
    @Size(min = 16, max = 16, message="Incorrect size of Sender's account")
    @Pattern(regexp = "\\d+", message="Number of Sender's account contain incorrect symbol")
    private String fromAccount;

    @DoesExist(message="Rrecipient's account doesn't exist")
    @NotNull(message="Field Rrecipient's account is empty")
    @Size(min = 16, max = 16, message="Incorrect size of Rrecipient's account")
    @Pattern(regexp = "\\d+", message="Number of Rrecipient's account contain incorrect symbol")
    private String toAccount;

    @NotNull(message="Amount of transfer is not filled")
    @Min(value = 1, message="Unacceptable amount of transfer")
    private Double amountTransfer;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Double getAmountTransfer() {
        return amountTransfer;
    }

    public void setAmountTransfer(Double amountTransfer) {
        this.amountTransfer = amountTransfer;
    }
}
