package com.TicTacToe;

import java.util.Scanner;

public class Player extends Field {
    private final int id;
    protected int[] spielsteine = {2, 2, 2};

    Player(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    protected void setSpielstein() {
        int[] allowedVal = {0, 1, 2};
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter row");
        int y = sc.nextInt();
        System.out.println("Please enter column");
        int x = sc.nextInt();
        System.out.println("Please enter value");
        int val = sc.nextInt();

        try {
            if (field[y][x].actualValue < allowedVal[val] && this.spielsteine[allowedVal[val]] > 0) {
                field[y][x] = new Spielstein(allowedVal[val], this);
                this.spielsteine[allowedVal[val]]--;
            } else {
                System.out.println("Bitte anderen Spielstein wählen");
                setSpielstein();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        printField();
        if (checkWin(this) != -1)  System.out.println("Herzlichen Glückwunsch Spieler " + checkWin(this) + ". Du hast gewonnen!");
    }

    public int getSpielsteine() {
        int count = 0;
        for(int spielstein : spielsteine) {
            count += spielstein;
        }

        return count;
    }

}
