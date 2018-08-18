package com.example.bank.model;

import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TransferModel {

    @NotNull(message="Field Sender's account is empty")
    @Size(min = 16, max = 16, message="Incorrect size of Sender's account")
    @Pattern(regexp = "\\d+", message="Number of Sender's account contain incorrect symbol")
    private String fromAccaunt;

    @NotNull(message="Field Rrecipient's account is empty")
    @Size(min = 16, max = 16, message="Incorrect size of Rrecipient's account")
    @Pattern(regexp = "\\d+", message="Number of Rrecipient's account contain incorrect symbol")
    private String toAccaunt;

    @NotNull(message="Amount of transfer is not filled")
    @Min(value = 1, message="Unacceptable amount of transfer")
    private Double amountTransfer;

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

    public Double getAmountTransfer() {
        return amountTransfer;
    }

    public void setAmountTransfer(Double amountTransfer) {
        this.amountTransfer = amountTransfer;
    }
}
