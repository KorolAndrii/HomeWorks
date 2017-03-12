package com.korol.homeworks.homework4.task24;

public interface Handler {
    void handlePayment(Payment payment);

    void setNextHandler(Handler handler);
}
