package com.gitter;

import java.util.Arrays;

public class Main {

    public static char[][] gitter (int n) {
        assert(n>0);
        char[][] charArray = new char[2*n+1][2*n+1];

        for(char[] chars: charArray)
            Arrays.fill(chars, ' ');

        for(int x = 1; x < charArray.length; x+=2)
            for(int y = 0; y < charArray[x].length; y++)
                charArray[x][y] = '*';

            for(int x = 0; x < charArray.length; x++){
                for(int y = 1; y < charArray[x].length; y +=2)
                    charArray[x][y] = '*';
            }

            return charArray;
    }

    public static void main(String[] args) {

        char[][] gitter = gitter(2);

        for(char[] content: gitter)
        System.out.println(Arrays.toString(content));
    }
}
