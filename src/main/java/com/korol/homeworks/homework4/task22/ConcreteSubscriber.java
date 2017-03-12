package com.korol.homeworks.homework4.task22;


import java.util.ArrayList;
import java.util.List;

public class ConcreteSubscriber implements SubscribeObserver {
    private List<Magazine> magazines = new ArrayList<>();

    public List<Magazine> getMagazines() {
        return magazines;
    }

    @Override
    public void takeNewMagazine(Magazine magazine) {
        magazines.add(magazine);
    }
}
