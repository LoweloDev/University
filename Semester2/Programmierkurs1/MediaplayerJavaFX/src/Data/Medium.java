package Data;

import java.io.OutputStream;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public abstract class Medium implements Serializable {

    @Serial
    private static final long serialVersionUID = 593941885280334624L;
    private static int idGenerator = 0;
    private final int id = idGenerator;
    private String title;
    private int year;


    Medium() {}

    Medium(String title, int year) {
        this.title = title;
        this.year = year;
        idGenerator++;
    }



    protected int age() {
        LocalDate date = LocalDate.now();

        return date.getYear() - year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    protected abstract void printData();
    protected abstract void printData(OutputStream stream);

    //TODO Override equals/hashcode generaliztaion in Mediaplayer ?
}