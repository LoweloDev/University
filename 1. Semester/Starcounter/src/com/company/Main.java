package com.company;

public class Main {

    static void starCalc_dimension2(char[][] starArray) {

        for (int dim1 = 0; dim1 < starArray.length; dim1++) {
            int starcount = 0;
            for (int dim2 = 0; dim2 < starArray[dim1].length; dim2++) {

                if (starArray[dim1][dim2] == '*') {
                    starcount++;
                }
            }
            System.out.printf("Col:%s Starcount:%s \n", dim1, starcount);
        }
    }

    static int[] starCalc_dimension1(char[][] starArray) {
        int[] starcount = new int[starArray.length];

        for (int dim1 = 0; dim1 < starArray.length; dim1++) {
            for (int dim2 = 0; dim2 < starArray[dim1].length; dim2++) {

                if (starArray[dim1][dim2] == '*') {
                    starcount[dim2]++;
                }
            }
        }

        for (int starcountIndex = 0; starcountIndex < starcount.length; starcountIndex++) {
            System.out.printf("Line:%s Starcount:%s\n", starcountIndex, starcount[starcountIndex]);
        }

        return starcount;   // returning starcount array for multistar count
    }

    static void multistar_calc(int[] starcount) {
        int multistarCount = 0;

        for (int starcountIndex = 0; starcountIndex < starcount.length; starcountIndex++) {

            if (starcount[starcountIndex] >= 2){
                multistarCount++;
            }
        }
        System.out.printf("Number of lines with 2 or more '*': %s \n", multistarCount);
    }

    public static void main(String[] args) {

        char[][] starArray = {{'*', '*', 'x'}, {'x', 'x'}, {'*', 'x'}};
        char[][] starArray2 = {{'*', '*'}, {'x', '*'}, {'*', 'x', 'x'}};

        System.out.println("Starcount Dimension 1 for Array 1 and 2: \n");
        int[][] starcount = {starCalc_dimension1(starArray), starCalc_dimension1(starArray2)};

        System.out.println("\nStarcount Dimension 2 for Array 1 and 2");
        starCalc_dimension2(starArray);
        starCalc_dimension2(starArray2);

        System.out.println("\nMultistar count Dimension 1, Array 1 and 2:");
        multistar_calc(starcount[0]);
        multistar_calc(starcount[1]);
    }
}
