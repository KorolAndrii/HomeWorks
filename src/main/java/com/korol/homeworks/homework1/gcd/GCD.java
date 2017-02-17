package com.korol.homeworks.homework1.gcd;

/**
 * Created by Somebody on 02.02.2017.
 */
public final class GCD {
    private GCD() {
        //not called
    }

    public static int gcd(int num1,  int num2) {
        int p = num1;
        int q = num2;

        if (p < 0) {
            p = Math.abs(p);
        }
        if (q < 0) {
            q = Math.abs(q);
        }
        return gcdMain(p, q);
    }

    private static int gcdMain(int num1, int num2) {
        int p = num1;
        int q = num2;

        if (p == 0) {
            return q;
        }
        if (q == 0) {
            return p;
        }

        // p and q even
        if ((p & 1) == 0 && (q & 1) == 0) {
            return gcd(p >> 1, q >> 1) << 1;
        }

        // p even, q is odd
        else if ((p & 1) == 0) {
            return gcd(p >> 1, q);
        }

        // p is odd, q even
        else if ((q & 1) == 0) {
            return gcd(p, q >> 1);
        }

        // p and q odd, p >= q
        else if (p >= q) {
            return gcd((p - q) >> 1, q);
        }

        // p and q odd, p < q
        else {
            return gcd(p,(q - p) >> 1);
        }
    }
}
