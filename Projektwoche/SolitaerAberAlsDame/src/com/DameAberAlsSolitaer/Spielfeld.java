package com.DameAberAlsSolitaer;

import java.util.Arrays;

public class Spielfeld {

    protected int[][] spielfeld;

    protected void ausgabeSpielfeld() {
        for (int[] row : spielfeld)
            System.out.println(Arrays.toString(row));
    }

    protected void starteSpiel(int size) {
        spielfeld = new int[size][size];

        for (int[] row : spielfeld)
            Arrays.fill(row, 1);

        spielfeld[2][2] = 0;
    }

    protected void zug(int x_curr, int y_curr, int x_new, int y_new) {

        if (spielfeld[y_new][x_new] == 0) {
            garbageCollect(x_curr, y_curr, x_new, y_new);
            spielfeld[y_curr][x_curr] = 0;
            spielfeld[y_new][x_new] = 1;
        }
    }

    protected void garbageCollect(int x_curr, int y_curr, int x_new, int y_new) {
        if (y_curr == y_new) {
            for (int x = Math.min(x_curr, x_new); x < Math.max(x_curr, x_new); x++) {
                spielfeld[y_curr][x] = 0;
            }
        } else if (x_curr == x_new) {
            for (int y = Math.min(y_curr, y_new) + 1; y < Math.max(y_curr, y_new); y++) {
                spielfeld[y][x_curr] = 0;
                System.out.println(y);
            }
        } else {
            for (int x = Math.min(x_curr, x_new); x < Math.max(x_curr, x_new); x++) {
                spielfeld[x][x] = 0;
            }
        }
    }
}
