package MediaplayerData;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Objects;

public class Bild extends Medium {
    private String location;

    public Bild(){}

    public Bild(String location, String title, int year) {
        super(title, year);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /* TODO to be deprecated */

    protected void printData() {
         System.out.printf("ID = %s, Title: %s, Location: %s, Year: %s\n", getId(), getTitle(), getLocation(), getYear());
    }

    protected void printData(OutputStream streamType) {
        PrintStream stream = new PrintStream(streamType);
        stream.printf("ID = %s, Title: %s, Location: %s, Year: %s\n", getId(), getTitle(), getLocation(), getYear());
        stream.close();
    }

     /* END */

    @Override
    public String toString() {
        return String.format("ID = %s, Title: %s, Location: %s, Year: %s\n", getId(), getTitle(), getLocation(), getYear());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (o instanceof Bild bild) {
            return getLocation().equals(bild.getLocation()) && getTitle().equals(bild.getTitle()) && getYear() == bild.getYear();
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocation(), getTitle(), getYear());
    }
}
