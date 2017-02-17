package com.korol.homeworks.homework2.task2;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Somebody on 14.02.2017.
 */
public class HardDriveDisk extends Memory{
    private int spindleSpeed;
    private Set<Virus> viruses = new HashSet<>();

    public HardDriveDisk(int capacity) {
        setCapacity(capacity);
    }

    public int getSpindleSpeed() {
        return spindleSpeed;
    }

    public void setSpindleSpeed(int spindleSpeed) {
        this.spindleSpeed = spindleSpeed;
    }

    public void addVirus(Virus virus) {
        viruses.add(virus);
    }

    public Set<Virus> getViruses() {
        return viruses;
    }

    public String showViruses() {
        return viruses.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        HardDriveDisk that = (HardDriveDisk) o;

        return new EqualsBuilder()
                .append(spindleSpeed, that.spindleSpeed)
                .append(this.getCapacity(), that.getCapacity())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(spindleSpeed)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "HardDriveDisk{" +
                "spindleSpeed=" + spindleSpeed +
                '}';
    }
}
