package com.korol.homeworks.homework1.gcd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 08.02.2017.
 */
public class GCDTest {
    @Test
    public void gcd() throws Exception {
        Assert.assertEquals(4, GCD.gcd(88, 36));
    }

    @Test
    public void gcdNegative() throws Exception {
        Assert.assertEquals(4, GCD.gcd(-88, 36));
    }

    @Test
    public void gcdBothNegative() throws Exception {
        Assert.assertEquals(4, GCD.gcd(-88, -36));
    }


    @Test
    public void gcdZero() throws Exception {
        Assert.assertEquals(5, GCD.gcd(5, 0));
    }

    @Test
    public void gcdZero2() throws Exception {
        Assert.assertEquals(5, GCD.gcd(0, 5));
    }

    @Test
    public void gcdDoubleZero() throws Exception {
        Assert.assertEquals(0, GCD.gcd(0, 0));
    }

}