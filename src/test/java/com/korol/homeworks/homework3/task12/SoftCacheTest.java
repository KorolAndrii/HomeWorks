package com.korol.homeworks.homework3.task12;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 22.02.2017.
 */
public class SoftCacheTest {
    List<String> locations;
    SoftCache softCache;
    StrongCache strongCache;

    @Before
    public void setUp() {
        softCache = new SoftCache();
        strongCache = new StrongCache();
        locations = new ArrayList<>();

        // 600 mb
        locations.add("C://book1.pdf");
        locations.add("C://book5.pdf");
        locations.add("C://book6.pdf");
        locations.add("C://book7.pdf");

        // 60 mb
        locations.add("C://book2.pdf");
        locations.add("C://book3.pdf");
        locations.add("C://book4.pdf");
    }

    @Test
    public void putSoftFile() throws IOException {
        softCache.putSoftFile(locations.get(0));
        softCache.putSoftFile(locations.get(1));
        softCache.putSoftFile(locations.get(2));
        softCache.putSoftFile(locations.get(3));
        softCache.putSoftFile(locations.get(4));
        softCache.putSoftFile(locations.get(5));
        Assert.assertEquals(true, softCache.putSoftFile(locations.get(6)));
    }


    @Test(expected = OutOfMemoryError.class)
    public void checkStrongCache() throws IOException {
        strongCache.getFile(locations.get(0));
        strongCache.getFile(locations.get(1));
        strongCache.getFile(locations.get(2));
        strongCache.getFile(locations.get(3));
        strongCache.getFile(locations.get(4));
    }
}