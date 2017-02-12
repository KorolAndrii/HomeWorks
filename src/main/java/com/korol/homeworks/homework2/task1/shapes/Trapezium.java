package com.korol.homeworks.homework2.task1.shapes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 12.02.2017.
 */
public class Trapezium extends Shape {
    private int a;
    private int b;

    public Trapezium(int a, int b, int height) {
        this.a = a;
        this.b = b;
        this.height = height;
        this.square = 0.5 *(a + b) * height;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return Shape.class.getSimpleName() + "a =" + a + ", b =" + b +
                " , height =" + getHeight() + ", square =" + getSquare();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Trapezium trapezium = (Trapezium) o;

        return new EqualsBuilder()
                .append(a, trapezium.a)
                .append(b, trapezium.b)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(a)
                .append(b)
                .toHashCode();
    }
}
