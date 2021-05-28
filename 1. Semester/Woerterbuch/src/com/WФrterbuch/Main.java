package com.Wörterbuch;

import java.util.Scanner;

public class Main {

    public static void menue()
    {
        System.out.println("1) Wort-Paar hinzufügen");
        System.out.println("2) Alle Wort-Paare anzeigen");
        System.out.println("3) Programm beenden");
    }

    private static String[] addWordPair(String[] dictionary, int currentIndex) {

        try {
            Scanner inputString = new Scanner(System.in);
            String wordPair = inputString.next() + inputString.next();

            dictionary[currentIndex] = wordPair;
        } catch(Exception e) {
            System.out.println("Max. number of entries reached");
        }

        return dictionary;
    }

    private static void printDictionary(String[] dictionary) {
        for (int i = 0; i < dictionary.length; i++) {
            System.out.println(dictionary[i]);
        }
    }

    public static void main(String[] args) {
	// write your code here
        boolean execute = true;
        String[] dictionary = new String[100];
        int currentIndex = 0;

        while (execute) {
            menue();
            Scanner inputValue = new Scanner(System.in);
            int value = inputValue.nextInt();



            switch(value) {
                case 1:
                    addWordPair(dictionary, currentIndex);
                    currentIndex++;
                    break;
                case 2:
                    printDictionary(dictionary);
                    break;
                default:
                    execute = false;
                    break;
            }
        }
    }
}
