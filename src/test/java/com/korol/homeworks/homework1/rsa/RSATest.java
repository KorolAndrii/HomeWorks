package com.korol.homeworks.homework1.rsa;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 04.02.2017.
 */
public class RSATest {
    private RSA rsa = new RSA(1024);
    private String message = "Alice and bob.";
    private String encrypted = rsa.encrypt(message);
    private String decrypted = rsa.decrypt(encrypted);

    @Test
    public void encrypt() throws Exception {
        encrypted = rsa.encrypt(message);
        Assert.assertNotEquals(message, encrypted);
    }

    @Test
    public void decrypt() throws Exception {
        decrypted = rsa.decrypt(encrypted);
        Assert.assertEquals(message, decrypted);
    }



}