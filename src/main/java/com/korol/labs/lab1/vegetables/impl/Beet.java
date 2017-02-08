package com.korol.labs.lab1.vegetables.impl;

import com.korol.labs.lab1.vegetables.Roots;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 05.02.2017.
 */
public  class Beet extends Roots {
    private boolean sweet;

    public boolean isSweet() {
        if (sweet) {
            return true;
        } else {
            return false;
        }
    }

    public void setSweet(boolean sweet) {
        this.sweet = sweet;
    }

    @Override
    public String toString() {
        return Beet.class.getSimpleName() + " name: " + this.getName() + " calories: " + this.getCalories();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Beet beet = (Beet) o;

        return new EqualsBuilder()
                .append(sweet, beet.sweet)
                .append(this.getName(), beet.getName())
                .append(this.getCalories(), beet.getCalories())
                .append(this.getCountry(), beet.getCountry())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(sweet)
                .append(this.getCalories())
                .append(this.getName())
                .append(this.getCountry())
                .toHashCode();
    }
}
