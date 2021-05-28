package com.TicTacToe;

import java.util.Arrays;

public class Field {
    static Spielstein[][] field;

    Field() {
    }

    Field(int n) {
        field = new Spielstein[n][n];
    }


    protected void initField() {
        for (Spielstein[] row : field) {
            for (int i = 0; i < row.length; i++) {
                row[i] = new Spielstein();
            }
        }
    }

    protected void printField() {
        for (Spielstein[] row : field) {
                System.out.println(Arrays.toString(row));
        }
    }



    protected int checkHorizontal(Player player) {
        for(int y = 0; y < field.length; y++) {
            int count = 0;
            for(int x = 0; x <= field.length; x++) {
                if(count == field.length) return player.getId();
                try {
                    if(field[y][x].getId() == player.getId()) count++;
                } catch (Exception e) {
                }
            }
        }

        return -1;
    }

    protected int checkVertical(Player player) {
        for(int x = 0; x < field.length; x++) {
            int count = 0;
            for(int y = 0; y <= field.length; y++) {
                if(count == field.length) return player.getId();
                try {
                    if(field[y][x].getId() == player.getId()) count++;
                } catch (Exception e) {

                }
            }
        }

        return -1;
    }

    protected int checkDiagonaleByRow(Player player) {
        for(int row = 0; row < field.length; row++){
            int count = 0;
            for(int diagonale = 0; diagonale <= field.length; diagonale++) {
                if(count == field.length) return player.getId();
                try {
                    if(field[diagonale + row][diagonale].getId() == player.getId()) count++;
                } catch (Exception e) {
                }
            }
        }
        return -1;
    }

    protected int checkDiagonaleByColumn(Player player) {
        for(int column = 0; column < field.length; column++){
            int count = 0;
            for(int diagonale = 0; diagonale <= field.length; diagonale++) {
                if(count == field.length) return player.getId();
                try {
                    if(field[diagonale][diagonale + column].getId() == player.getId()) count++;
                } catch (Exception e) {
                }
            }
        }
        return -1;
    }

    protected int checkWin(Player player) {
        int[] winner = {checkHorizontal(player), checkVertical(player), checkDiagonaleByRow(player), checkDiagonaleByColumn(player)};
        int winnerID = Integer.MIN_VALUE;

        for (int id : winner)
            if (id > winnerID) winnerID = id;


        return winnerID;
    }

    protected void play() {
        Player[] players = {new Player(1), new Player(2)};
        int currPlayer = 0;

        while(checkWin(players[0]) == -1 && checkWin(players[1]) == -1 && players[currPlayer].getSpielsteine() > 0) {
            System.out.println("Am Zug ist Spieler: " + players[currPlayer].getId());
            players[currPlayer].setSpielstein();
            if(currPlayer == 0) {
                currPlayer = 1;
            } else {
                currPlayer = 0;
            }
        }
    }
}
