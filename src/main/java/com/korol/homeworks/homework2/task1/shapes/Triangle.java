package com.korol.homeworks.homework2.task1.shapes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 12.02.2017.
 */
public class Triangle extends Shape{
    private double baseSide;
    private double secondSide;
    private double thirdSide;

    private double alpha;
    private double beta;
    private double gama;

    public Triangle(double baseSide, double secondSide, double thirdSide) throws IllegalArgumentException {
        if (baseSide + secondSide < thirdSide || baseSide + thirdSide < secondSide ||
                thirdSide + secondSide < baseSide ) {
            throw new IllegalArgumentException();
        }  else {
            this.baseSide = baseSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
            init();
        }
    }

    private void init() {
        double temp;
        alpha = Math.acos((Math.pow(secondSide, 2) + Math.pow(baseSide, 2) - Math.pow(thirdSide, 2)) /
                (2 * secondSide * baseSide));
        beta = Math.acos((Math.pow(thirdSide, 2) + Math.pow(baseSide, 2) - Math.pow(secondSide, 2)) /
                (2 * thirdSide * baseSide));
        gama = Math.PI - (alpha + beta);

        temp = Math.PI / 2 - alpha;
        height = Math.cos(temp) * secondSide;
        square = 0.5 * height * baseSide;
    }


    @Override
    public String toString() {
        return Shape.class.getSimpleName() + "baseSide =" + baseSide + ", secondSide =" + secondSide +
                ", thirdSide =" + thirdSide + " , height =" + getHeight() + ", square =" + getSquare();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        return new EqualsBuilder()
                .append(baseSide, triangle.baseSide)
                .append(secondSide, triangle.secondSide)
                .append(thirdSide, triangle.thirdSide)
                .append(alpha, triangle.alpha)
                .append(beta, triangle.beta)
                .append(gama, triangle.gama)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(baseSide)
                .append(secondSide)
                .append(thirdSide)
                .append(alpha)
                .append(beta)
                .append(gama)
                .toHashCode();
    }
}
