package com.korol.homeworks.homework4.task24;

public class FinishHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handlePayment(Payment payment) {
        System.out.println("Transaction finished, amount is - " + payment.getAmount());
    }

    @Override
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }
}
