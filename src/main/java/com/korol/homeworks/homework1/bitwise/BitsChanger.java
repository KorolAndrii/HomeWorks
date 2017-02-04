package com.korol.homeworks.homework1.bitwise;

/**
 * Created by Somebody on 02.02.2017.
 */
public class BitsChanger {

    /**
     * method for changing bit
     * on the position
     */
    public static int bitChange(int number, int pos, boolean flag) {
        if (pos > 30 || pos < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            return (flag) ? number | (1 << pos) : number & ~(1 << pos);
        }
    }
}
