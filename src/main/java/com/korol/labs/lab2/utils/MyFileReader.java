package com.korol.labs.lab2.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Somebody on 21.02.2017.
 */

public final class MyFileReader {
    private MyFileReader() {

    }

    public static String read(String path) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String aux = null;

            while ((aux = br.readLine()) != null) {
                builder.append(aux);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
