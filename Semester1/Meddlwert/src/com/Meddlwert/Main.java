package com.Meddlwert;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputScan = new Scanner(System.in);

        int sum = 0;
        int inputCount = 0;
        while(true){
            int inputVal = inputScan.nextInt();
            if(inputVal != -1) {
                sum += inputVal;
                inputCount++;
            } else {
                break;
            }
        }

        System.out.println(sum);
        System.out.println((double) sum/inputCount);
    }
}
