package com.korol.labs.lab2.text_members;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Somebody on 21.02.2017.
 */
public class Word implements SentenceMember {
    private List<Symbol> symbols = new ArrayList<>();

    public Word() {
    }

    public Word(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Symbol symbol : symbols) {
            s.append(symbol);
        }
        return s.toString();
    }
}
