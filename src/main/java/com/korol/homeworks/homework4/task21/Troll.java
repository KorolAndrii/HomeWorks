package com.korol.homeworks.homework4.task21;

public class Troll implements Character {
    @Override
    public String move(Moves moves) {
        switch (moves) {
            case WALK:
                return"I can do this!";
            default:
                return "I'm a troll! I can't do this.";
        }
    }
}
