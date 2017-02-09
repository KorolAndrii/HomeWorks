package com.korol.homeworks.homework1.multiplication;

import java.math.BigInteger;


/**
 * Created by Somebody on 04.02.2017.
 */
public final class FastMultiplicator {
    private FastMultiplicator() {
        // not called
    }

    /**
     * @param i - first number
     * @param j - second number
     * @return multiplication
     */
    public static BigInteger kara(BigInteger i, BigInteger j) {

        int n = Math.max(i.bitLength(), j.bitLength());
        if(n <= 5) {
            return i.multiply(j);
        } else {
            n = n / 2 + n % 2;

            /**
             * partition numbers on the components
             */
            BigInteger b = i.shiftRight(n);
            BigInteger a = i.subtract(b.shiftLeft(n));
            BigInteger d = j.shiftRight(n);
            BigInteger c = j.subtract(d.shiftLeft(n));

            BigInteger ac = kara(a, c);
            BigInteger bd = kara(b, d);
            BigInteger abcd = kara(a.add(b), c.add(d));
            return ac.add(abcd.subtract(ac).subtract(bd).shiftLeft(n)).add(bd.shiftLeft(2 * n));
        }
    }
}

