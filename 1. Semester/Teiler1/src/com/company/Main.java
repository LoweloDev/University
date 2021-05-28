package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void calculateDividers(int numberToDivide) {

        for (int divider = 1; divider <= numberToDivide; divider++) {
            if (numberToDivide % divider == 0) System.out.println(divider);
        }
    }

    static void calculateMaxDividersInRange(int numberToDivide) {
        int[] numbersToDivide = new int[numberToDivide];
        int[] dividerCount = new int[numberToDivide];

        Arrays.setAll(numbersToDivide, num -> num <= numberToDivide ? num+1 : null);

        for (int numIndex = 0; numIndex < numbersToDivide.length; numIndex++){
            for (int divider = 1; divider <= numbersToDivide[numIndex]; divider++) {
                if (numbersToDivide[numIndex] % divider == 0) dividerCount[numIndex]++;
            }
        }


        System.out.println(Arrays.stream(dividerCount).max().getAsInt());
    }


    public static void main(String[] args) {

        Scanner inputVal = new Scanner(System.in);


        String[] optionList = {"1. Divider count for n", "2. Max. divider count for number between 1 and n", "3. Escape"};

        for (int i = 0; i < optionList.length; i++) {
            System.out.println(optionList[i]);
        }

        System.out.println("Please choose an option by entering the number");
        int choosenOption = inputVal.nextInt();

        switch (choosenOption) {
            case 1:
                System.out.println("Please enter number n");
                calculateDividers(inputVal.nextInt());
                break;
            case 2:
                System.out.println("Please enter number n");
                calculateMaxDividersInRange(inputVal.nextInt());
                break;
            default:
                System.out.println("Cya.");
                break;
        }
    }
}
