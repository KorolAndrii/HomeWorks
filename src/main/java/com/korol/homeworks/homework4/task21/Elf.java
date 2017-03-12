package com.korol.homeworks.homework4.task21;

public class Elf implements Character {
    @Override
    public String move(Moves moves) {
        switch (moves) {
            case WALK:
                return  "I can do this!";
            case MAGIC_FLY:
                return  "I can do this!";
            default:
                return "I'm a elf! I can't do this!";
        }
    }
}
