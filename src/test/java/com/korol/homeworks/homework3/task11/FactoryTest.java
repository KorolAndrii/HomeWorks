package com.korol.homeworks.homework3.task11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 26.02.2017.
 */
public class FactoryTest {
    private Factory factory;
    private int limit;

    @Before
    public void setUp() {
        limit = 10;
        factory = Factory.getFactory(limit);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFactory() throws Exception {
        Factory.getFactory(-2);
    }

    @Test
    public void createObjects() throws Exception {
        for (int i = 0; i < 15; i++) {
            factory.createObjects();
        }
        Assert.assertEquals(10, factory.getCount());
    }

}