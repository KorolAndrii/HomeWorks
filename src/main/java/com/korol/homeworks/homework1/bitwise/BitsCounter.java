package com.korol.homeworks.homework1.bitwise;

/**
 * Created by Somebody on 04.02.2017.
 */
public final class BitsCounter {
    private BitsCounter() {
        // not called
    }

    public static int byteLength() {
        byte num = 1;
        int i = 1;
        while (num > 0) {
            num <<= 1;
            i++;
        }
        return i;
    }

    public static int shortLength() {
        short num = 1;
        int i = 1;
        while (num > 0) {
            num <<= 1;
            i++;
        }
        return i;
    }

    public static int intLength() {
        int num = 1;
        int i = 1;
        while (num > 0) {
            num <<= 1;
            i++;
        }
        return i;
    }

    public static int longLength() {
        long num = 1;
        int i = 1;
        while (num > 0) {
            num <<= 1;
            i++;
        }
        return i;
    }
}
