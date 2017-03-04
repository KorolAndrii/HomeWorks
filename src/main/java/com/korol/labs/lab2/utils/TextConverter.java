package com.korol.labs.lab2.utils;

import com.korol.labs.lab2.text_members.PunctuationMark;
import com.korol.labs.lab2.text_members.Sentence;
import com.korol.labs.lab2.text_members.Symbol;
import com.korol.labs.lab2.text_members.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Somebody on 21.02.2017.
 */
public final class TextConverter {
    private TextConverter() {}

    public static List<Sentence> convertText(String text) {
        if (text == null) {
            throw new IllegalArgumentException();
        }
        List<Sentence> sentences = new ArrayList<>();
        List<String> stringSentence = TextParser.parseToSentence(text);
        for (String tempSentence : stringSentence) {
            Sentence sentence = new Sentence();
            List<String> tempWords = TextParser.parseToWords(tempSentence);
            for (String tempWord : tempWords) {
                Word word = new Word();
                PunctuationMark punctuationMark = null;
                char[] tempSymbols = TextParser.parseToSymbols(tempWord);
                for (char symbol : tempSymbols) {
                    if (!isPunctuationMark(symbol)) {
                        word.getSymbols().add(new Symbol(symbol));
                    } else {
                        punctuationMark = new PunctuationMark(new Symbol(symbol));
                    }
                }
                sentence.getSentenceMembers().add(word);
                sentence.wordAdded();
                if (punctuationMark != null) {
                    sentence.getSentenceMembers().add(punctuationMark);
                }
            }
            sentences.add(sentence);
        }
        return sentences;
    }

    private static boolean isPunctuationMark(char symbol) {
        char [] punctuation = {'.' , ',' , ';' , ':', '?' , '!'};

        for (int i = 0; i < punctuation.length; i++){
            if(symbol == punctuation[i]){
                return true;
            }
        }
        return false;
    }
}

