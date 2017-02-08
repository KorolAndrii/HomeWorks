package com.korol.labs.lab1.vegetables.impl;

import com.korol.labs.lab1.vegetables.Solanaceaes;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 05.02.2017.
 */
public class Tomato extends Solanaceaes {
    private boolean color;

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public String whatColor() {
        if (color) {
            return "Red";
        } else {
            return "Yellow";
        }
    }

    @Override
    public String toString() {
        return Tomato.class.getSimpleName() + " name: " + this.getName() + " calories: " + this.getCalories();
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

