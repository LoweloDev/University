package com.Sandbox;

public class Main {
    public static void main(String[] args) {
        int x = 30; int y=11;
        do { x--;
        } while (x-- > y++);
        System.out.println(x);
        System.out.println(y);
    }
}
