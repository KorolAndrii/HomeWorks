package com.korol.labs.lab2.comparators;

import com.korol.labs.lab2.text_members.Sentence;

import java.util.Comparator;

/**
 * Created by Somebody on 28.02.2017.
 */
public final class NumberOfWordsComparator implements Comparator<Sentence> {
    private static NumberOfWordsComparator comparator;

    public static NumberOfWordsComparator getInstance() {
        if (comparator == null) {
            comparator = new NumberOfWordsComparator();
        }
        return comparator;
    }

    private NumberOfWordsComparator() {

    }

    @Override
    public int compare(Sentence s1, Sentence s2) {
        Integer numberOfWords1 = s1.getNumberOfWords();
        Integer numberOfWords2 = s2.getNumberOfWords();
        return numberOfWords1.compareTo(numberOfWords2);
    }
}
