package com.korol.homeworks.homework4.task16;

import java.util.HashSet;
import java.util.Set;

public class Ship {
    private Set<Cell> cells = new HashSet<>(4);
    private boolean killed;
    private int cellNumb;

    public void setCells(Cell[] cells) {
        for (Cell cell : cells) {
            this.cells.add(cell);
            cell.setShip();
            cellNumb++;
        }
    }

    public boolean isKilled() {
        if (!killed) {
            for (Cell cell : cells) {
                if (!cell.isShooted()) {
                    return false;
                }
            }
        }
        killed = true;
        return true;
    }

    private int getCellNumb() {
        return cellNumb;
    }
}
