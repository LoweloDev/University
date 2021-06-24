package com.Dezhex;

public class Main {

    public static String dezhex(int zahl) {
        assert(zahl >= 0);
        char[] hexValues = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexResult = "";
        while(zahl > 0) {
            int hexValCalc = zahl % 16;
            zahl = zahl/16;
            hexResult = hexValues[hexValCalc] + hexResult;
        }

        return hexResult;
    }
    public static void main(String[] args) {
	// write your code here
        int zahl = 45791;

        String x = dezhex(zahl);

        System.out.println(x);
    }
}
