package com.korol.homeworks.homework4.task22;

import java.util.ArrayList;
import java.util.List;

public class PublishingHouse {
    private List<PostOfficeObserver> postOffices = new ArrayList();
    private List<Magazine> magazines = new ArrayList<>();

    public void publish(int magazineNumber) {
        Magazine magazine =  new Magazine(magazineNumber);
        magazines.add(magazine);
        sendToAllPostOffices(magazine);
    }

    public void registerObserver(PostOfficeObserver observer) {
        postOffices.add(observer);
    }

    public void removeObserver(PostOfficeObserver observer) {
        postOffices.remove(observer);
    }

    public void sendToAllPostOffices(Magazine magazine) {
        for (PostOfficeObserver postOffice : postOffices) {
            postOffice.takeNewMagazine(magazine);
        }
    }
}
