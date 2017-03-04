package com.korol.labs.lab2.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public final class TextParser {
    private TextParser() {

    }

    public static List<String> parseToSentence(String text) {
        if (text == null) {
            throw new IllegalArgumentException();
        }
        List<String> strings = new ArrayList<>();
        Pattern p = Pattern.compile("[\"']?[A-Z][^.?!]+((?![.?!]['\"]?\\s[\"']?[A-Z][^.?!]).)+[.?!'\"]+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            strings.add(m.group());
        }
        return strings;
    }

    public static List<String> parseToWords(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException();
        }
        String[] tempWords = sentence.split("\\s+");
        return Arrays.asList(tempWords);
    }

    public static char[] parseToSymbols(String word) {
        if (word == null) {
            throw new IllegalArgumentException();
        }
        return word.toCharArray();
    }
}
