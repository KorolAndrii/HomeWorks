package com.korol.homeworks.homework2.task1;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 12.02.2017.
 */
public class Parallelogram extends Polygon {
    private double a;
    private double b;
    private double angle1;
    private double angle2;

    public Parallelogram(double a, double b, double angel) {
        this.a = a;
        this.b = b;
        this.angle1 = angel;
        angle2 = 180 - angel;
        init();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getAngle1() {
        return angle1;
    }

    public void setAngle1(double angle1) {
        this.angle1 = angle1;
    }

    public double getAngle2() {
        return angle2;
    }

    public void setAngle2(double angle2) {
        this.angle2 = angle2;
    }

    private void init() {
        if (angle1 == Math.PI / 2) {
            height = a;
            square = a * b;
        } else {
            height = Math.cos(Math.PI / 2 - toRadians(angle1)) * a;
            square = a * height;
        }
    }

    @Override
    public String toString() {
        return Shape.class.getSimpleName() + "a =" + a + ", b =" + b +
                ", height =" + getHeight() + ", square =" + getSquare();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Parallelogram that = (Parallelogram) o;

        return new EqualsBuilder()
                .append(a, that.a)
                .append(b, that.b)
                .append(angle1, that.angle1)
                .append(angle2, that.angle2)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(a)
                .append(b)
                .append(angle1)
                .append(angle2)
                .toHashCode();
    }
}
