package com.korol.homeworks.homework2.task2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Somebody on 14.02.2017.
 */
public abstract class Memory {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object obj);
}
