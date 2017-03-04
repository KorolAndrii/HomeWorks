package com.korol.labs.lab2.utils;

import com.korol.labs.lab2.text_members.Sentence;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 28.02.2017.
 */
public class TextConverterTest {
    private String case1;
    private String expacted1;
    private String case2;


    private List<Sentence> sentences;

    @Before
    public void setUp() {
        case1 = "   The longer,,,, and (revised) \"version\" of The Picture of Dorian Gray published in book form in 1891 " +
                "featured an aphoristic preface defence of the artist's rights and of " +
                "art for art's sake—based in part on his press defences of the         novel the previous year!";

        expacted1 = "[The longer, and (revised) \"version\" of The Picture of Dorian Gray published in book form in 1891 featured" +
                " an aphoristic preface defence of the artist's rights and of art for art's sake—based in part on his press " +
                "defences of the novel the previous year!]";

        case2 = null;
    }

    @Test
    public void convertText() throws Exception {
        sentences = TextConverter.convertText(case1);
        Assert.assertEquals(expacted1, sentences.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertTextNull() throws Exception {
        sentences = TextConverter.convertText(case2);
    }

}