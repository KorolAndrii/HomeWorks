package com.korol.homeworks.homework1.rsa;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by Somebody on 04.02.2017.
 */
public class RSA {
    private static final BigInteger ONE = new BigInteger("1");
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final BigInteger DEFAULT_PUBLIC_KEY = new BigInteger("65537");

    private BigInteger privateKey;
    private BigInteger publicKey = DEFAULT_PUBLIC_KEY;
    private BigInteger modulus;
    private int bitsNum;

    /**
     * @param bitsNum - the numbers of bits for number generation
     */
    RSA(int bitsNum) {
        if (bitsNum <= 0) {
            throw new ArithmeticException("invalid number of bits");
        }
        this.bitsNum = bitsNum;
        init();
    }

    public static BigInteger getDefaultPublicKey() {
        return DEFAULT_PUBLIC_KEY;
    }

    public BigInteger getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(BigInteger publicKey) {
        this.publicKey = publicKey;
    }

    public void setBitsNum(int bitsNum) {
        this.bitsNum = bitsNum;
    }

    public int getBitsNum() {
        return bitsNum;
    }

    /**
     * Simple initialization
     */
    private void init() {
        BigInteger p = BigInteger.probablePrime(bitsNum / 2, RANDOM);
        BigInteger q = BigInteger.probablePrime(bitsNum / 2, RANDOM);
        BigInteger phi = (p.subtract(ONE)).multiply(q.subtract(ONE));

        modulus = p.multiply(q);
        privateKey = publicKey.modInverse(phi);
    }

    /**
     * @param message
     * @return encrypted message
     */
    public String encrypt(String message) {
        return (new BigInteger(message.getBytes())).modPow(publicKey, modulus).toString();
    }

    /**
     * @param message
     * @return decrypted message
     */
    public String decrypt(String message) {
        return new String(new BigInteger(message).modPow(privateKey, modulus).toByteArray());
    }
}

