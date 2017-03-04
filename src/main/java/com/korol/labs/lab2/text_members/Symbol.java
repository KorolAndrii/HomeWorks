package com.korol.labs.lab2.text_members;

/**
 * Created by Somebody on 18.02.2017.
 */
public class Symbol {
    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "" + symbol;
    }
}
