package com.Dateien;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Dateien {
    public static void copy(File from, File to) throws FileNotFoundException {
        RandomAccessFile rFrom = new RandomAccessFile(from, "r");
        RandomAccessFile rTo = new RandomAccessFile(to, "rw");
        try {
            int inhalt = rFrom.read();
            while (inhalt != -1) {
                rTo.write(inhalt);
                inhalt = rFrom.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                rFrom.close();
                rTo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void cat(File source) {
        try (RandomAccessFile quelle = new RandomAccessFile(source, "r")){
            int inhalt = quelle.read();
            while (inhalt != -1) {
                System.out.print(Character.toString(inhalt));
                inhalt = quelle.read();
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
