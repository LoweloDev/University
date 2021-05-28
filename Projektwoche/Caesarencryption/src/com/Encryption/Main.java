package com.Encryption;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    private static String encryption(String string, int shift) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder encryptedString = new StringBuilder(string);

        for (int index = 0; index < string.length(); index++) {
            for (int character = 0; character < alphabet.length; character++) {
                try {
                    if(string.charAt(index) == alphabet[character]) encryptedString.setCharAt(index, alphabet[character + shift]);
                } catch (Exception e) {

                }
            }
        }
        return encryptedString.toString();
    }

    private static String decryption(String encryptedString, int shift) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        StringBuilder decryptedString = new StringBuilder(encryptedString);

        for (int index = 0; index < encryptedString.length(); index++) {
            for (int character = 0; character < alphabet.length; character++) {
                try {
                    if(encryptedString.charAt(index) == alphabet[character]) decryptedString.setCharAt(index, alphabet[character - (shift)]);
                } catch (Exception e) {

                }
            }
        }
        return decryptedString.toString();
    }

    private static ArrayList<String> autoDecrypt(String encryptedString) {
        ArrayList<String> decryptedStrings = new ArrayList<>();

        for ( int x = 0; x < 50; x++){
            decryptedStrings.add(decryption(encryptedString, x));
        }
        return decryptedStrings;
    }


    public static void main(String[] args) {
	// write your code here
        String[] options = {"Text to encrypt", "Text to decrypt", "Enter Shift", "Encrypt", "Decrypt", "Autodecrypt", "Cancel"};

        String originalText = "";
        String encryptedText = "";
        int shift = 0;

        boolean execute = true;

        while (execute) {
            int menu = JOptionPane.showOptionDialog(null, "Main Menu",
                    "Click a button", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch (menu) {
                case 0 -> originalText = JOptionPane.showInputDialog("Enter Text to encrypt");
                case 1 -> encryptedText = JOptionPane.showInputDialog("Enter Text to decrypt");
                case 2 -> shift = Integer.parseInt(JOptionPane.showInputDialog("Enter shift value"));
                case 3 -> System.out.println(encryption(originalText, shift));
                case 4 -> System.out.println(decryption(encryptedText, shift));
                case 5 -> System.out.println(autoDecrypt(encryptedText));
                default -> execute = false;
            }
        }
    }
}
