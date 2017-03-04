package com.korol.labs.lab2.text_members;

/**
 * Created by Somebody on 21.02.2017.
 */
public class PunctuationMark implements SentenceMember {
    private Symbol symbol;

    public PunctuationMark() {
    }

    public PunctuationMark(Symbol symbol) {
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol.toString();
    }
}
