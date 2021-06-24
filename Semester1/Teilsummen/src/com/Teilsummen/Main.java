package com.Teilsummen;

public class Main {

    public static void main(String[] args) {
	int[] teilsummen = {1 , 1 , 1 , 1 , 1};

	for (int i = 0; i < teilsummen.length; i++) {
	    for(int z = 0; z < i; z++){
	        teilsummen[i] += teilsummen[z];
        }
    }

	for (int k = 0; k < teilsummen.length; k++)
        System.out.println(teilsummen[k]);
    }
}
