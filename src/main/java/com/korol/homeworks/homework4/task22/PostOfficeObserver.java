package com.korol.homeworks.homework4.task22;

public interface PostOfficeObserver extends Observer {
    void registerObserver(SubscribeObserver subscriber1);

    void sendToAllPostSubscribers();
}
