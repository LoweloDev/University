package com.TicTacToe;

public class Spielstein {
    protected int[] value = {0, 1, 2};
    protected int actualValue;
    protected String playerLetter;
    private int playerID;

    Spielstein () {
        actualValue = -1;
    }

    Spielstein(int value, Player player) {
        super();
        actualValue = this.value[value];
        playerLetter = (player.getId() == 1) ? "X" : "O";
        this.playerID = player.getId();
    }

    public int getId() {
        return playerID;
    }

    @Override
    public String toString() {
        if (playerLetter == null)
            return " ";
        return playerLetter + actualValue;
    }
}
