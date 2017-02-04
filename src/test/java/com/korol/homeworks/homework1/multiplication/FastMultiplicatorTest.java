package com.korol.homeworks.homework1.multiplication;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 04.02.2017.
 */
public class FastMultiplicatorTest {
    @Test
    public void kara() throws Exception {
        BigInteger a = new BigInteger("5125");
        BigInteger b = new BigInteger("4214214");
        Assert.assertEquals(new BigInteger("21597846750"), FastMultiplicator.kara(a, b));
    }

}