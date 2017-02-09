package com.korol.homeworks.homework1.multiplication;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 04.02.2017.
 */
public class FastMultiplicatorTest {
    @Test(expected = NullPointerException.class)
    public void karaNullPointerExc() {
        BigInteger a = null;
        BigInteger b  = null;
        FastMultiplicator.kara(a, b);
    }

    @Test(expected = NullPointerException.class)
    public void karaNullPointerExc2() {
        BigInteger a = null;
        BigInteger b  = new BigInteger("4214214");
        FastMultiplicator.kara(a, b);
    }

    @Test(expected = NullPointerException.class)
    public void karaNullPointerExc3() {
        BigInteger a = new BigInteger("4214214");
        BigInteger b  = null;
        FastMultiplicator.kara(a, b);
    }

    @Test
    public void kara() throws Exception {
        BigInteger a = new BigInteger("5125");
        BigInteger b = new BigInteger("4214214");
        Assert.assertEquals(new BigInteger("21597846750"), FastMultiplicator.kara(a, b));
    }

    @Test
    public void karaNegativeValue() throws Exception {
        BigInteger a = new BigInteger("-321321312312");
        BigInteger b = new BigInteger("42142141421412");
        Assert.assertEquals(new BigInteger("-13541168185165996856024544"), FastMultiplicator.kara(a, b));
    }

    @Test
    public void karaWithNull1() throws Exception {
        BigInteger a = new BigInteger("0");;
        BigInteger b = new BigInteger("4214214");
        Assert.assertEquals(new BigInteger("0"), FastMultiplicator.kara(a, b));
    }

    @Test
    public void karaWithNull2() throws Exception {
        BigInteger a = new BigInteger("4214214");;
        BigInteger b = new BigInteger("0");
        Assert.assertEquals(new BigInteger("0"), FastMultiplicator.kara(a, b));
    }
}