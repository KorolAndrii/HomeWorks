package com.korol.homeworks.homework1.gcd;

/**
 * Created by Somebody on 02.02.2017.
 */
public class GCD {

    /**
     * method for greatest common divisor
     */
    public static int gcd(int a, int b) {
       return b == 0 ? a : gcd(b, a % b);
    }
}
