package com.Dateien;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        //Some tests
        Dateien.cat(new File("./src/com/Dateien/Main.java"));
        try {
            Dateien.copy(new File("./src/com/Dateien/Main.java"), new File("./src/com/Dateien/Main.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
