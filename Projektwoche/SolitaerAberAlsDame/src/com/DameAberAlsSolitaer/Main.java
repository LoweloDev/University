package com.DameAberAlsSolitaer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Spielfeld x = new Spielfeld();
        x.starteSpiel(5);

        x.zug(4, 4, 2, 2);

        x.ausgabeSpielfeld();
    }
}
