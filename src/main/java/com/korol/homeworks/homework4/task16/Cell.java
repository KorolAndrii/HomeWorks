package com.korol.homeworks.homework4.task16;

public class Cell {
    private boolean shooted;
    private boolean shipOn;

    public Cell() {
    }

    public void shot() {
        shooted = true;
    }

    public boolean isShooted() {
        return shooted;
    }

    public boolean isShipOn() {
        return shipOn;
    }

    public void setShip(){
        shipOn = true;
    }

    @Override
    public String toString() {
        if (this.isShooted()) {
            return "[X]";
        }
        return "[ ]";
    }
}
