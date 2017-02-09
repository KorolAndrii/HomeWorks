package com.korol.homeworks.homework1.rsa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.IllegalFormatException;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 04.02.2017.
 */
public class RSATest {

    private RSA rsa;
    private String message;
    private String encrypted;
    private String decrypted;

    @Before
    public void setUp() throws Exception {
        rsa = new RSA(1024);
        message = "Alice and bob.";
        encrypted = rsa.encrypt(message);
        decrypted = rsa.decrypt(encrypted);
    }

    @Test(expected = IllegalFormatException.class)
    public void rsaEncNullPointerExc() {
        String message = null;
        rsa.encrypt(message);
    }

    @Test(expected = IllegalFormatException.class)
    public void rsaDecrNullPointerExc() {
        String message = null;
        rsa.decrypt(message);
    }

    @Test
    public void encrypt() throws Exception {
        Assert.assertNotNull(rsa);
        encrypted = rsa.encrypt(message);
        Assert.assertNotEquals(message, encrypted);
    }

    @Test
    public void decrypt() throws Exception {
        Assert.assertNotNull(rsa);
        decrypted = rsa.decrypt(encrypted);
        Assert.assertEquals(message, decrypted);
    }
}