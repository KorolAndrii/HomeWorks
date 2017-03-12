package com.korol.homeworks.homework4.task25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int makeMove() throws IOException {
        int result = 0;
        boolean flag;
        do {
            System.out.print("Enter cell number: ");
            String input = br.readLine();
            if (input.equals("")) {
                flag = true;
                continue;
            }
            flag = false;
            if (input.matches("[+-]?\\d+")) {
                result = Integer.parseInt(input);
                if (result < 0) return result;
                if (result > 8) {
                    flag = true;
                    System.out.println("Incorrect value, try again.");
                    continue;
                }
            } else {
                flag = true;
                continue;
            }
        } while (flag);
        return result;
    }
}
