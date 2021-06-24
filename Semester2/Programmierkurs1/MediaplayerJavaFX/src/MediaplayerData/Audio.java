package MediaplayerData;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Objects;

public class Audio extends Medium {
    private String interprete;
    private int duration;

    public Audio(){}

    public Audio(String interprete, int duration, String title, int year) {
        super(title, year);
        this.interprete = interprete;
        this.duration = duration;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    /* TODO to be deprecated */

    protected void printData() {
        System.out.printf("ID = %s Title: %s Interprete: %s Duration: %s minutes Year: %s\n", getId(), getTitle(), getInterprete(), getDuration(), getYear());
    }

    protected void printData(OutputStream streamType) {
        PrintStream stream = new PrintStream(streamType);
        stream.printf("ID = %s Title: %s Interprete: %s Duration: %s minutes Year: %s\n", getId(), getTitle(), getInterprete(), getDuration(), getYear());
        stream.close();
    }

    /* END */

    @Override
    public String toString() {
        return String.format("ID = %s Title: %s Interprete: %s Duration: %s minutes Year: %s\n", getId(), getTitle(), getInterprete(), getDuration(), getYear());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (o instanceof Audio audio) {
            return getTitle().equals(audio.getTitle()) && getInterprete().equals(audio.getInterprete()) && getDuration() == audio.getDuration() && getYear() == audio.getYear();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInterprete(), getDuration(), getYear(), getTitle());
    }
}
