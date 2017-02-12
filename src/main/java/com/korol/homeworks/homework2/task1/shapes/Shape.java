package com.korol.homeworks.homework2.task1.shapes;

import java.util.List;

/**
 * Created by Somebody on 12.02.2017.
 */
public abstract class Shape {
    protected double height;
    protected double square;

    public static double toRadians(double degree) {
        return degree * Math.PI / 180;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getHeight() {
        return height;
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
