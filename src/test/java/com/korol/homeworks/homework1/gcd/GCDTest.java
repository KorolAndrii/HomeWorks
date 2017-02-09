package com.korol.homeworks.homework1.gcd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 08.02.2017.
 */
public class GCDTest {
    @Test
    public void gcdMax() throws Exception {
        Assert.assertEquals(5, GCD.gcd(Integer.MAX_VALUE, 10));
    }

    @Test
    public void gcdMin() throws Exception {
        Assert.assertEquals(4, GCD.gcd(Integer.MIN_VALUE, 20));
    }

    @Test
    public void gcdZero() throws Exception {
        Assert.assertEquals(5, GCD.gcd(5, 0));
    }

    @Test
    public void gcdZero2() throws Exception {
        Assert.assertEquals(5, GCD.gcd(0, 5));
    }


}