package com.korol.labs.lab2;

import com.korol.labs.lab2.comparators.NumberOfWordsComparator;
import com.korol.labs.lab2.text_members.Sentence;
import com.korol.labs.lab2.utils.MyFileReader;
import com.korol.labs.lab2.utils.TextConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Somebody on 28.02.2017.
 */
public class Text {
    private List<Sentence> text;

    public Text() {
        text = new ArrayList<>();
    }

    public List<Sentence> getText() {
        return text;
    }

    public List<Sentence> createTextFromFile(String path) {
        String stringText = MyFileReader.read(path);
        text = TextConverter.convertText(stringText);
        return text;
    }

    @Override
    public String toString() {
        String s = "";
        for (Sentence sentence : text) {
            s += (sentence.toString()) + "\n";
        }
        return s;
    }

    public List<Sentence> sort() {
        text.sort(NumberOfWordsComparator.getInstance());
        return text;
    }


    public List<Sentence> sortAndShow() {
        text.stream().sorted(NumberOfWordsComparator.getInstance())
                     .map(text -> {int i = text.getNumberOfWords();
                        System.out.println(i);
                        return text;})
                     .forEach(System.out::println);
        return text;
    }

    public static void main(String[] args) {

    }
}
