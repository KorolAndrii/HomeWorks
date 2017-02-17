package com.korol.homeworks.homework2.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 14.02.2017.
 */
public class ShapeTest {
    private Shape circle;
    private Shape triangle;
    private Shape parallelogram;
    private Shape trapezium;
    private double circleAndTriangleSquare;

    @Before
    public void setUp() {
        circle = new Circle(5);
        triangle = new Triangle(5, 5, 7);
        parallelogram = new Parallelogram(10, 10, 35);
        trapezium = new Trapezium(5, 4, 10);
        circleAndTriangleSquare = circle.getSquare() + triangle.getSquare();
    }

    @Test
    public void toRadians() throws Exception {
        Assert.assertEquals(Math.PI * 2, Shape.toRadians(360), 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void toRadiansNegative() {
        Shape.toRadians(-20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void toRadiansBig() {
        Shape.toRadians(361);
    }

    @Test
    public void squareSum() throws Exception {
        Assert.assertEquals(circleAndTriangleSquare, circle.squareSum(triangle), 3);
    }

}