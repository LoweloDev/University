package com.company;

import java.util.Scanner;

public class Main {

    static double investmentCalculation(double investment, double term, double investmentRate, int bonus) {

        return (investment * (investmentRate/100) * (term/360)) + bonus + investment;
    }

    public static void main(String[] args) {
        Scanner inputVal = new Scanner(System.in);

        System.out.println("Bitte senden Sie nacheinander ihr Investment als ganze oder Gleitkommazahl und ihre gewünschte Laufzeit in Monaten.");
        double investment = inputVal.nextInt();
        double term = inputVal.nextInt() * 30;
        double investmentRate = 0;
        int bonus = 0;
        String[] investmentRates = {"1. 1,5 % Verzinsung ohne Bonuszahlung", "2. 0,7 % Verzinsung mit 15 Euro Bonuszahlung", "3. 0,4 % Verzinsung mit 20 Euro Bonuszahlung", "4. 0,1 % Verzinsung mit 50 Euro Bonuszahlung"};

        for (int i = 0; i < investmentRates.length; i++) {
            System.out.println(investmentRates[i]);
        }

        System.out.println("Bitte wählen Sie ein Angebot aus. Geben Sie dazu bitte die entsprechende Zahl ein.");
        int choose_investmentRate = inputVal.nextInt();

            while (true) {
                switch (choose_investmentRate) {
                    case 1:
                        investmentRate = 1.5;
                        break;
                    case 2:
                        investmentRate = 0.7;
                        bonus = 15;
                        break;
                    case 3:
                        investmentRate = 0.4;
                        bonus = 20;
                        break;
                    case 4:
                        investmentRate = 0.1;
                        bonus = 50;
                        break;
                    default:
                        System.out.println("Please choose an investment rate contained in the list");
                        choose_investmentRate = inputVal.nextInt();
                        continue;
                }

            break;
            }

        System.out.println(investmentCalculation(investment, term, investmentRate, bonus));
        }
    }
