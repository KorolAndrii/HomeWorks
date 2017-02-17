package com.korol.homeworks.homework2.task2;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 14.02.2017.
 */
public class OperativeMemory extends Memory{
    private double memoryFrequency;

    public OperativeMemory(int capacity) {
        setCapacity(capacity);
    }

    public OperativeMemory(double memoryFrequency) {
        this.memoryFrequency = memoryFrequency;
    }

    public double getMemoryFrequency() {
        return memoryFrequency;
    }

    public void setMemoryFrequency(double memoryFrequency) {
        this.memoryFrequency = memoryFrequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        OperativeMemory that = (OperativeMemory) o;

        return new EqualsBuilder()
                .append(memoryFrequency, that.memoryFrequency)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(memoryFrequency)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "OperativeMemory{" +
                "memoryFrequency=" + memoryFrequency +
                '}';
    }
}
