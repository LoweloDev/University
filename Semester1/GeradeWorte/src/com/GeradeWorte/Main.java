package com.GeradeWorte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[] wordList = new String[5];
	Scanner inputVal = new Scanner(System.in);

	for(int i = 0; i < wordList.length; i++)
	    wordList[i] = inputVal.next();

	for(int x = 0; x < wordList.length; x++) {
        if ( wordList[x].length() % 2 == 0) {
            System.out.println("gerade" + wordList[x]);
        }
    }

	for (int z = 0; z < wordList.length; z++)
	    if ( wordList[z].length() % 2 != 0) {
            System.out.println("ungerade" + wordList[z]);
        }
    }
}
