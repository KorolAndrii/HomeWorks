package com.korol.homeworks.homework4.task23;

public class GrantConfirmed extends GrantState {

    @Override
    public String toString() {
        return "GrantConfirmed{}";
    }

    public GrantConfirmed(Grant grant) {
        super(grant);
    }

    @Override
    public void confirm() {
        System.out.println("Grant is confirmed");
    }

    @Override
    public void deferred() {
        System.out.println("Grant is confirmed");
    }

    @Override
    public void reject() {
        System.out.println("Grant is confirmed");
    }

    @Override
    public void consider() {
        System.out.println("Grant is confirmed");
    }
}
