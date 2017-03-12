package com.korol.homeworks.homework4.task24;

public class TaxHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handlePayment(Payment payment) {
        if (nextHandler != null) {
            switch (payment.getType()) {
                case NORMAL:
                    // 10%
                    payment.setAmount(payment.getAmount() * 0.9);
                    nextHandler.handlePayment(payment);
                    break;
                case PREFERENTIAL:
                    // 3%
                    payment.setAmount(payment.getAmount() * 0.97);
                    nextHandler.handlePayment(payment);
                    break;
                case STATE:
                    // 7%
                    payment.setAmount(payment.getAmount() * 0.93);
                    nextHandler.handlePayment(payment);
                    break;
                case INTRA:
                    // 0%
                    nextHandler.handlePayment(payment);
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
