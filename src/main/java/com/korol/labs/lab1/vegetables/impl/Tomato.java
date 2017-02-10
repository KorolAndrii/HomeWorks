package com.korol.labs.lab1.vegetables.impl;

import com.korol.labs.lab1.vegetables.Solanaceaes;
import com.korol.labs.lab1.vegetables.SupplierCountry;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 05.02.2017.
 */
public class Tomato extends Solanaceaes {
    private TomatoColor color;

    public Tomato() {
    }

    public Tomato(float calories) {
        super(calories);
    }

    public Tomato(String name, float calories, SupplierCountry supplierCountry, float diameter, TomatoColor color) {
        super(name, calories, supplierCountry, diameter);
        this.color = color;
    }

    public TomatoColor getColor() {
        return color;
    }

    public void setColor(TomatoColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return Tomato.class.getSimpleName() + " name: " + this.getName() + " calories: " + this.getCalories()
                + " country: " + this.getCountry() + "(" + this.getCountry().getRating() + ")" + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Tomato tomato = (Tomato) o;

        return new EqualsBuilder()
                .append(color, tomato.color)
                .append(this.getName(), tomato.getName())
                .append(this.getCalories(), tomato.getCalories())
                .append(this.getCountry(), tomato.getCountry())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(color)
                .append(this.getCalories())
                .append(this.getName())
                .append(this.getCountry())
                .toHashCode();
    }
}

