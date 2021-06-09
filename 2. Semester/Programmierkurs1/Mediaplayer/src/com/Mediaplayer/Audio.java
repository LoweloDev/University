package com.Mediaplayer;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Audio extends Medium {

    protected String interprete;
    protected int duration;

    public Audio(String interprete, int duration, String title, int year) {
        super(title, year);
        this.interprete = interprete;
        this.duration = duration;
    }

    protected void printData() {
        System.out.printf("ID = %s Title: %s Interprete: %s Duration: %s minutes Year: %s\n", getId(), title, interprete, duration, year);
    }

    protected void printData(OutputStream streamType) {
        PrintStream stream = new PrintStream(streamType);
        stream.printf("ID = %s Title: %s Interprete: %s Duration: %s minutes Year: %s\n", getId(), title, interprete, duration, year);
        stream.close();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (o instanceof Audio) {
            Audio audio = (Audio) o;
            if (title.equals(audio.title) && interprete.equals(audio.interprete) && duration == audio.duration && year == audio.year)
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(interprete, duration, year, title);
    }
}
