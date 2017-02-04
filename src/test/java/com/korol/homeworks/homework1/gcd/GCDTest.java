package com.korol.homeworks.homework1.gcd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 02.02.2017.
 */
public class GCDTest {
    @Test
    public void gcd() throws Exception {
        Assert.assertEquals(3, GCD.gcd(12,15));
    }

}