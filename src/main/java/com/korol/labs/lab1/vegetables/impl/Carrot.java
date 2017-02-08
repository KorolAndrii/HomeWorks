package com.korol.labs.lab1.vegetables.impl;

import com.korol.labs.lab1.vegetables.Roots;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 05.02.2017.
 */
public class Carrot extends Roots {
    private boolean typeShape;

    public boolean isTypeShape() {
        return typeShape;
    }

    public void setTypeShape(boolean typeShape) {
        this.typeShape = typeShape;
    }

    public String whatShape() {
        if (typeShape) {
            return "Regular shape";
        } else {
            return "Unusual shape";
        }
    }

    @Override
    public String toString() {
        return Carrot.class.getSimpleName() + " name: " + this.getName() + " calories: " + this.getCalories();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Carrot carrot = (Carrot) o;

        return new EqualsBuilder()
                .append(typeShape, carrot.typeShape)
                .append(this.getName(), carrot.getName())
                .append(this.getCalories(), carrot.getCalories())
                .append(this.getCountry(), carrot.getCountry())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(typeShape)
                .append(this.getCalories())
                .append(this.getName())
                .append(this.getCountry())
                .toHashCode();
    }
}
