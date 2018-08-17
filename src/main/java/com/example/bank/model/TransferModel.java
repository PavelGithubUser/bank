package com.example.bank.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TransferModel {

    private String fromAccaunt;

    private String toAccaunt;

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
