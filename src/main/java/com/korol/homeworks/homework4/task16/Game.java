package com.korol.homeworks.homework4.task16;

import java.io.IOException;

public class Game {
    Player[] players = new Player[2];

    public void newGamePlayerVSPlayer() throws IOException {
        players = new Player[]{new Player(), new Player()};
        players[0].createFieldWithShips();
        players[1].createFieldWithShips();
        players[0].setOpponentField(players[1].fields[0]);
        players[1].setOpponentField(players[0].fields[0]);

        int switcher = 0;
        while (!players[switcher].gameOver()) {
            System.out.println("Player № " + (switcher + 1));
            players[switcher].fields[1].drawField();
            players[switcher].doShot();
            switcher = this.moveSwitcher(switcher);
        }
        System.out.println("Player № " + (switcher + 1) + " WIN");
    }

    private int moveSwitcher(int i) {
        if (i == 0) return 1;
        return 0;
    }

    public static void main(String[] args) throws IOException {
        Game game = new Game();
        game.newGamePlayerVSPlayer();

        /*Field field = new Field();
        field.setShips();
        field.drawField();*/
    }
}
