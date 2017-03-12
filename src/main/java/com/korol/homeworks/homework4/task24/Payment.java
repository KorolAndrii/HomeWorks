package com.korol.homeworks.homework4.task24;

public class Payment {
    private double amount;
    private PaymentType type;

    public Payment(int amount, PaymentType type) {
        this.amount = amount;
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentType getType() {
        return type;
    }
}
