package com.korol.homeworks.homework4.task16;

public class Field {
    private Cell[][] cells = new Cell[10][10];
    private Ship[] ships = new Ship[10];

    public Field() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cells[i][j] = new Cell();
            }
        }
        for (int i = 0; i < 10; i++) {
            ships[i] = new Ship();
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setShot(int x, int y) {
        cells[x][y].shot();
    }

    public boolean allShipsKilled() {
        for (Ship ship : ships) {
            if (!ship.isKilled()) {
                return false;
            }
        }
        return true;
    }

    public void drawField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(cells[i][j]);
            }
            System.out.println();
        }
    }


    public void setShips() {
        ships[0].setCells(new Cell[]{cells[0][0], cells[0][1], cells[0][2], cells[0][3]});
        ships[1].setCells(new Cell[]{cells[4][2], cells[5][2], cells[6][2]});
        ships[2].setCells(new Cell[]{cells[1][5], cells[2][5], cells[3][5]});
        ships[3].setCells(new Cell[]{cells[5][0], cells[6][0]});
        ships[4].setCells(new Cell[]{cells[5][4], cells[5][5]});
        ships[5].setCells(new Cell[]{cells[9][8], cells[9][9]});
        ships[6].setCells(new Cell[]{cells[2][8]});
        ships[7].setCells(new Cell[]{cells[4][9]});
        ships[8].setCells(new Cell[]{cells[7][6]});
        ships[9].setCells(new Cell[]{cells[5][8]});
    }
}
