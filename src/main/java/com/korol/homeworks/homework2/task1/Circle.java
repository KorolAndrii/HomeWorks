package com.korol.homeworks.homework2.task1;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 13.02.2017.
 */
public class Circle extends Shape{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.square = Math.pow(radius, 2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return Shape.class.getSimpleName() + " radius =" + getRadius() + ", square =" + getSquare();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return new EqualsBuilder()
                .append(radius, circle.radius)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(radius)
                .toHashCode();
    }
}
