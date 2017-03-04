package com.korol.labs.lab2;

import com.korol.labs.lab2.text_members.Sentence;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 28.02.2017.
 */
public class TextTest {
    private Text text;
    private List<Sentence> unsortedSentences;

    @Before
    public void setUp() {
        text = new Text();
        unsortedSentences = text.createTextFromFile("C://text.txt");
    }

    @Test
    public void sortAndShow() throws Exception {
        text.createTextFromFile("C://text.txt");
        text.sortAndShow();
        text.sort();
        System.out.println();
        unsortedSentences.stream().forEach(System.out :: println);
        System.out.println();
        System.out.println(text.toString());
    }
}