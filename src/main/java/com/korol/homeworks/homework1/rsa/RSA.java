package com.korol.homeworks.homework1.rsa;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by Somebody on 04.02.2017.
 */
public class RSA {
    private final static BigInteger one = new BigInteger("1");
    private final static SecureRandom random = new SecureRandom();

    private BigInteger privateKey;
    private BigInteger publicKey;
    private BigInteger modulus;

    /**
     * we pass to the constructor the number of bits
     */
    RSA(int N) {
        if (N <= 0) {
            throw new ArithmeticException("invalid number of bits");
        }
        BigInteger p = BigInteger.probablePrime(N / 2, random);
        BigInteger q = BigInteger.probablePrime(N / 2, random);
        BigInteger phi = (p.subtract(one)).multiply(q.subtract(one));

        modulus = p.multiply(q);
        publicKey = new BigInteger("65537");
        privateKey = publicKey.modInverse(phi);
    }

    public String encrypt(String message) {
        return (new BigInteger(message.getBytes())).modPow(publicKey, modulus).toString();
    }

    public String decrypt(String message) {
        return new String((new BigInteger(message).modPow(privateKey, modulus).toByteArray()));
    }
}

