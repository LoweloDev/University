package com.TicTacToe;

public class Main {

    public static void main(String[] args) {
        Field field = new Field(5);
        field.initField();
        field.play();
    }
}
