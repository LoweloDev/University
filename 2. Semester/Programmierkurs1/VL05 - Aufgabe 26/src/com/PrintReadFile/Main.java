package com.PrintReadFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    static String readStringFile(File filePath) throws IOException {
        StringBuffer buffer = new StringBuffer();

        RandomAccessFile fileContents = new RandomAccessFile(filePath, "r");

        while(fileContents.getFilePointer() < fileContents.length()) {
            buffer.append(fileContents.readLine() + System.lineSeparator());
        }

        return buffer.toString();
    }

    public static void main(String[] args) throws IOException {
        File file = new File("/home/lowelodev/IdeaProjects/VL05 - Aufgabe 26/FILETOREAD.txt");

        System.out.println(readStringFile(file));
    }
}
