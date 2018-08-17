package com.example.bank.model;

import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TransferModel {

    @Size(min = 16, max = 16, message="incorrect size of from account")
    @Pattern(regexp = "\\d+", message="number of from account contain incorrect symbol")
    private String fromAccaunt;

    @Size(min = 16, max = 16, message="incorrect size of to account")
    @Pattern(regexp = "\\d+", message="number of from account contain incorrect symbol")
    private String toAccaunt;

    @Min(value = 1, message="unacceptable amount of transfer")
    private double amountTransfer;

    public String getFromAccaunt() {
        return fromAccaunt;
    }

    public void setFromAccaunt(String fromAccaunt) {
        this.fromAccaunt = fromAccaunt;
    }

    public String getToAccaunt() {
        return toAccaunt;
    }

    public void setToAccaunt(String toAccaunt) {
        this.toAccaunt = toAccaunt;
    }

    public double getAmountTransfer() {
        return amountTransfer;
    }

    public void setAmountTransfer(double amountTransfer) {
        this.amountTransfer = amountTransfer;
    }
}
