package com.korol.labs.lab2.text_members;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Somebody on 21.02.2017.
 */
public class Sentence {
    private List<SentenceMember> sentenceMembers = new ArrayList<>();
    private int numberOfWords = 0;

    public List<SentenceMember> getSentenceMembers() {
        return sentenceMembers;
    }

    public void wordAdded() {
        numberOfWords++;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < sentenceMembers.size() - 1; i++) {
            SentenceMember marker = sentenceMembers.get(i);
            SentenceMember nextMarker = sentenceMembers.get(i + 1);
            if ((marker instanceof Word) && (nextMarker instanceof PunctuationMark)) {
                s.append(marker);
            } else {
                s.append(marker);
                s.append(" ");
            }
        }
        s.append(sentenceMembers.get(sentenceMembers.size() - 1));
        return s.toString();
    }
}
