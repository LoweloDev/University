package com.Zahlenfolge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static void printMin(ArrayList<Integer> sequence) {
        int min = Integer.MAX_VALUE;

        for (Integer integer : sequence) {
            if (integer < min) min = integer;
        }

        System.out.println(min);
    }

    private static void printMax(ArrayList<Integer> sequence) {
        int max = Integer.MIN_VALUE;

        for (Integer integer : sequence) {
            if (integer > max) max = integer;
        }

        System.out.println(max);
    }

    private static void printSum(ArrayList<Integer> sequence) {
        int sum = 0;

        for (Integer integer : sequence) {
            sum += integer;
        }

        System.out.println(sum);
    }

    private static void printAvg(ArrayList<Integer> sequence) {
        int sum = 0;

        for(Integer integer : sequence) {
            sum += integer;
        }

        System.out.println((double) sum / sequence.size());
    }

    private static ArrayList<Integer> readValues() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList<>();
        boolean execute = true;
        int value;

            while (execute) {
                System.out.println("Please enter Value:");
                value = input.nextInt();
                sequence.add(value);

                System.out.println("Add another value? Y/N");
                String confirmation = input.next();
                if(!confirmation.equals("y")) execute = false;
            }

        return sequence;
    }
    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> sequence = readValues();
        System.out.println(sequence.toString());

        printMin(sequence);
        printMax(sequence);
        printSum(sequence);
        printAvg(sequence);
    }
}
