package com.korol.homeworks.homework1.bitwise;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 04.02.2017.
 */
public class BitsCounterTest {
    @Test
    public void byteLength() throws Exception {
        Assert.assertEquals(8, BitsCounter.byteLength());
    }

    @Test
    public void shortLength() throws Exception {
        Assert.assertEquals(16, BitsCounter.shortLength());
    }

    @Test
    public void intLength() throws Exception {
        Assert.assertEquals(32, BitsCounter.intLength());
    }

    @Test
    public void longLength() throws Exception {
        Assert.assertEquals(64, BitsCounter.longLength());
    }

}