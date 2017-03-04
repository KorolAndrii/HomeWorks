package com.korol.labs.lab2.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 28.02.2017.
 */
public class MyFileReaderTest {
    private String expected;

    @Before
    public void setUp() {
        expected = "The only novel written by Wilde, The Picture of Dorian Gray exists in several versions: the 1890 magazine edition (in 13 Chapters), with important material deleted before " +
                "publication by the magazine's editor, Stoddart; the \"uncensored\" version submitted to Lippincott's Monthly Magazine for publication (also in 13 chapters), with all " +
                "of Wilde's original material intact, first published in 2011 by Harvard University Press; and the 1891 book edition (in 20 Chapters). As literature of the 19th century,  " +
                "The Picture of Dorian Gray is an example of Gothic fiction with strong themes interpreted from Faust.";
    }

    @Test
    public void read() throws Exception {
        Assert.assertEquals(expected, MyFileReader.read("C://text1.txt"));
    }

    @Test
    public void readEmpty() throws Exception {
        Assert.assertEquals("", MyFileReader.read("C://text2.txt"));
    }
}