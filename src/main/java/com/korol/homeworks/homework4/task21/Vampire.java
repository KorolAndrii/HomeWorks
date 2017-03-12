package com.korol.homeworks.homework4.task21;

public class Vampire implements Character {
    @Override
    public String move(Moves moves) {
        switch (moves) {
            case MAGIC_FLY:
                return "I can do this.";
            case FLY:
                return "I can do this.";
            case WALK:
                return "I can do this.";
            default:
                return "I'm a vampire! I can't do this!";
        }
    }
}
