package com.korol.homeworks.homework1.bitwise;


/**
 * Created by Somebody on 02.02.2017.
 */
public final class BitsChanger {
    private BitsChanger() {
        // not called
    }

    /**
     * Method for changing bit on the position
     * @param number - input value
     * @param pos - number of bit that will be changed
     * @param flag - marker that changes bit to 1 or 0
     */
    public static int bitChange(int number, int pos, boolean flag) {
        if (pos > 30 || pos < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            return flag ? number | (1 << pos) : number & ~(1 << pos);
        }
    }
}
