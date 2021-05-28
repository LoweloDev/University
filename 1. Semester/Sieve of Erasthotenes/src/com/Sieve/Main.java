package com.Sieve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    boolean isPrime;
    int valIndex;

    Main(boolean isPrime, int valIndex){
        this.isPrime = isPrime;
        this.valIndex = valIndex;
    }

    private static List<Main> isntPrime(boolean[] sieveState, int currIndex){
        List<Main> isntPrime = new ArrayList<Main>();

        for(int sieveIndex = currIndex; sieveIndex < sieveState.length; sieveIndex++){
            if(!sieveState[sieveIndex]) {
                Main valToCheck = new Main(sieveState[sieveIndex], sieveIndex);
                isntPrime.add(valToCheck);
            }
        }
        return isntPrime;
    }

    private static boolean[] sieveErasthotenes(int[] values) {
        boolean[] sieveState = new boolean[values.length];
        Arrays.fill(sieveState, false);
        sieveState[0] = true;

        for(int currIndex = 1; currIndex < values.length; currIndex++){
            if(values[currIndex] * values[currIndex] < values[values.length-1]){

                List<Main> valsToCheck = isntPrime(sieveState, currIndex+1);
                int currVal = values[currIndex];

                valsToCheck.forEach( value -> {
                    if(values[value.valIndex] % currVal == 0) {
                        sieveState[value.valIndex] = true;
                    }
                });
            }
        }
        return sieveState;
    }

    private static void printPrimeN(int[] values, boolean[] sieveState) {
        for(int i = 0; i < sieveState.length; i++){
            if(!sieveState[i]) {
                System.out.println(values[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner inputVal = new Scanner(System.in);

        int erasthVal = inputVal.nextInt();

        int[] sieveArray = IntStream.rangeClosed(1, erasthVal).toArray();
        boolean[] sieveState = sieveErasthotenes(sieveArray);

        printPrimeN(sieveArray, sieveState);
    }
}
