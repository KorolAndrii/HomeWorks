package com.korol.homeworks.homework2.task2;

/**
 * Created by Somebody on 14.02.2017.
 */
public class CentralProcessingUnit {
    private double frequency;

    public CentralProcessingUnit(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CentralProcessingUnit{" +
                "frequency=" + frequency +
                '}';
    }
}
