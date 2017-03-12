package com.korol.homeworks.homework4.task22;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements PostOfficeObserver {
    private List<SubscribeObserver> subscribers = new ArrayList();
    private List<Magazine> magazines = new ArrayList<>();

    public void takeNewMagazine(Magazine magazine) {
        magazines.add(magazine);
    }

    public void registerObserver(SubscribeObserver observer) {
        subscribers.add(observer);
    }

    public void removeObserver(SubscribeObserver observer) {
        subscribers.remove(observer);
    }

    public void sendToAllPostSubscribers() {
        for (SubscribeObserver subscriber : subscribers) {
            for (Magazine magazine : magazines) {
                subscriber.takeNewMagazine(magazine);
            }
        }
    }
}
