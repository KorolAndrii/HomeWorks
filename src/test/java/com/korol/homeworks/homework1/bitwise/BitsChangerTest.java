package com.korol.homeworks.homework1.bitwise;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 04.02.2017.
 */
public class BitsChangerTest {
    @Test
    public void bitChange() throws Exception {
        Assert.assertEquals("9 = 1001, change bite on pos 3, 0001 = 1", 1,
                BitsChanger.bitChange(9, 3, false));
    }

}