package com.Bruchrechnung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bruch b = new Bruch(4, 8);
        b.reduce();
        System.out.println(b);
    }
}
