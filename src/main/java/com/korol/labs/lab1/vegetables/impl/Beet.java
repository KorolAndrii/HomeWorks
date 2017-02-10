package com.korol.labs.lab1.vegetables.impl;

import com.korol.labs.lab1.vegetables.Roots;
import com.korol.labs.lab1.vegetables.SupplierCountry;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 05.02.2017.
 */
public  class Beet extends Roots {
    private boolean sweet;

    /**
     *
     */
    public Beet() {
    }

    public Beet(float calories) {
        super(calories);
    }

    public Beet(String name, float calories, SupplierCountry supplierCountry, float rootLength, boolean sweet) {
        super(name, calories, supplierCountry, rootLength);
        this.sweet = sweet;
    }

    public boolean isSweet() {
        return sweet;
    }

    public void setSweet(boolean sweet) {
        this.sweet = sweet;
    }

    @Override
    public String toString() {
        return Beet.class.getSimpleName() + " name: " + this.getName() + " calories: " + this.getCalories()
                + " country: " + this.getCountry() + "(" + this.getCountry().getRating() + ")" + "\n";
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
                .append(this.getRootLength(), beet.getRootLength())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(sweet)
                .append(this.getCalories())
                .append(this.getName())
                .append(this.getCountry())
                .append(this.getRootLength())
                .toHashCode();
    }
}
