package com.korol.homeworks.homework4.task24;

public class FixingHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handlePayment(Payment payment) {
        System.out.println("Transaction started, amount is - " + payment.getAmount());
        if (nextHandler != null) {
            nextHandler.handlePayment(payment);
        } else {
            System.out.println("Set the next handler.");
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }

}
