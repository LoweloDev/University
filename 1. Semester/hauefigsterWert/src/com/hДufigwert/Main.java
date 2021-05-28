package com.häufigwert;

public class Main {

    public static void main(String[] args) {
    	int[] feld = {1,2,3,4};
    	int newIndex = feld.length-1;

    	for(int feldI = 0; feldI < feld.length/2; feldI++){
    		int currVal = feld[newIndex];
    		feld[newIndex] = feld[feldI] ;
    		feld[feldI] = currVal;
			newIndex--;
		}

    	for(int feldVal : feld){

    		System.out.println(feldVal);
		}

    }
}

