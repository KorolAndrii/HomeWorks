package com.korol.labs.lab2.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by Somebody on 28.02.2017.
 */
public class TextParserTest {
    private String textForSentences;
    private String textForWords;
    private List<String> sentences;
    private List<String> words;
    private char[] symbols;

    @Before
    public void setUp() {
        textForSentences = "The Picture of Dorian Gray is a philosophical novel by Oscar Wilde, first published complete in the July 1890 issue of Lippincott's Monthly Magazine. " +
                "The magazine's editor feared the story was indecent, and without Wilde's knowledge, deleted roughly five hundred words before publication. " +
                "Despite that censorship, The Picture of Dorian Gray offended the moral sensibilities of British book reviewers, some of whom said that Oscar Wilde merited" +
                "prosecution for violating the laws guarding the public morality.";
        textForWords = "The Picture of Dorian Gray is a philosophical novel by Oscar Wilde, first published complete in the July 1890 issue of Lippincott's Monthly Magazine.";
    }

    @Test
    public void parseToSentence() throws Exception {
        sentences = TextParser.parseToSentence(textForSentences);
        Assert.assertEquals(3, sentences.size());
    }

    @Test
    public void parseToWords() throws Exception {
        words = TextParser.parseToWords(textForWords);
        Assert.assertEquals(24, words.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseToSentenceNull() throws Exception {
        sentences = TextParser.parseToSentence(null);

    }

    @Test(expected = IllegalArgumentException.class)
    public void parseToWordsNull() throws Exception {
        sentences = TextParser.parseToWords(null);

    }

    @Test(expected = IllegalArgumentException.class)
    public void parseToSymbolsNull() throws Exception {
        symbols = TextParser.parseToSymbols(null);

    }

}