package com.korol.homeworks.homework4.task16;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Player {
    protected Field[] fields = new Field[2];

    public Player() {
    }

    public void createFieldWithShips() {
        fields[0] = new Field();
        fields[0].setShips();
    }

    public Field getMyField() {
        return fields[0];
    }

    public Field getOprtField() {
        return fields[1];
    }

    public void setOpponentField(Field opponentField) {
        fields[1] = opponentField;
    }

    public Field getOpponentField() {
        return fields[1];
    }

    public boolean gameOver() {
        if (fields[0].allShipsKilled() || fields[1].allShipsKilled()) {
            return true;
        }
        return false;
    }

    public void doShot() throws IOException {
        int x = 0;
        int y = 0;
        Field opponentField = fields[1];
        boolean correctValue = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            String input = br.readLine();
            if (input.matches("^\\d\\s\\d$")) {
                correctValue = false;
                List<String> list = Arrays.asList(input.split("\\s"));
                x = Integer.parseInt(list.get(0));
                y = Integer.parseInt(list.get(1));
                if (!opponentField.getCells()[x][y].isShooted() && !opponentField.getCells()[x][y].isShipOn()) {
                    opponentField.setShot(x, y);
                    System.out.println("Missed!");
                    correctValue = false;
                } else if (!opponentField.getCells()[x][y].isShooted() && opponentField.getCells()[x][y].isShipOn()) {
                    opponentField.setShot(x, y);
                    System.out.println("Got one!");
                    correctValue = true;
                } else correctValue = true;
            }
        } while (correctValue);
    }
}
