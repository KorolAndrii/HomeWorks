package com.korol.homeworks.homework4.task21;

public class Context {
    private Character character;

    public Context() {
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        if (character == null) {
            throw new IllegalArgumentException();
        }
        this.character = character;
    }

    public String move(Moves moves) {
        return character.move(moves);
    }
}
