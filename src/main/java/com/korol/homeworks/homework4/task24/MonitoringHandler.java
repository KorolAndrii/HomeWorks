package com.korol.homeworks.homework4.task24;

import java.util.EventListener;

public class MonitoringHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handlePayment(Payment payment) {
        System.out.println("Checking the limit...");
        if (nextHandler != null) {
            switch (payment.getType()) {
                case NORMAL :
                    if (payment.getAmount() >= 0 && payment.getAmount() <= 2000) {
                        nextHandler.handlePayment(payment);
                    } else {
                        System.out.println("Limit exceeded!");
                    }
                    break;
                case PREFERENTIAL:
                    if (payment.getAmount() >= 0 && payment.getAmount() <= 2500) {
                        nextHandler.handlePayment(payment);
                    } else {
                        System.out.println("Limit exceeded!");
                    }
                    break;
                case STATE:
                    if (payment.getAmount() >= 0 && payment.getAmount() <= 10000) {
                        nextHandler.handlePayment(payment);
                    } else {
                        System.out.println("Limit exceeded!");
                    }
                    break;
                case INTRA:
                    if (payment.getAmount() >= 0 && payment.getAmount() <= 1000000000) {
                        nextHandler.handlePayment(payment);
                    } else {
                        System.out.println("Limit exceeded!");
                    }
                    break;
                default:
                    System.out.println("Something wrong.");
                    break;
            }
        } else {
            System.out.println("Set the next handler.");
        }

    }

    @Override
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }
}
