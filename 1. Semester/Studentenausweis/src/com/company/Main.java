package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		System.out.println("Bitte Name, Matrikelnummer und Zahlen zur Addition nacheinander senden:");

		final Scanner input = new Scanner(System.in);

		final String student_name = input.nextLine();
		int mat_number = input.nextInt();
		final int mat_number_add = input.nextInt() + input.nextInt();

		mat_number = mat_number + mat_number_add;

		System.out.printf("Student: %s\nMatriculation number: %s",student_name, mat_number);

    }
}



