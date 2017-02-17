package com.korol.homeworks.homework2.task1;

/**
 * Created by Somebody on 12.02.2017.
 */
public abstract class Shape {
    protected double square;

    public static double toRadians(double degree) throws IllegalArgumentException {
        if (degree < 0.0 || degree > 360.0) {
            throw new IllegalArgumentException();
        }
        return degree * Math.PI / 180;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    public  double squareSum(Shape shape) {
        return this.getSquare() + shape.getSquare();
    }

    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract String toString();
}
