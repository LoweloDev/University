package com.DreiHochT;


public class Main {

    public static int faktoren3(int n) {
        int nMod = 0;
        int t = 0;

        while (nMod == 0) {
            n /= 3;
            nMod = n % 3;
            t++;
        }
        return t;
    }

    public static int maximum(int n) {
        assert(n>0);
        int maxFactorEven = faktoren3(n);

        if(maxFactorEven % 2 != 0) maxFactorEven--;

        return maxFactorEven;
    }

    public static void main(String[] args) {
        int max = maximum(27);

        System.out.println(max);
    }
}
