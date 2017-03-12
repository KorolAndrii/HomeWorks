package com.korol.homeworks.homework4.task21;

public class Pegasus implements Character {
    @Override
    public String move(Moves moves) {
        switch (moves) {
            case FLY:
                return"I can do this!";
            case WALK:
                return "I can do this!";
            default:
                return "I'm a pegasus! I can't do this!";
        }
    }
}
