package Data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Medienverwaltung {

    // static? Maybe?
//    public ArrayList<Medium> mediums = new ArrayList<>();
    public ObservableList<Medium> mediums = FXCollections.observableArrayList(new ArrayList<>());

    public void addMedium(Medium medium) {
        mediums.add(medium);
    }

    public void showMediums() {
        mediums.sort(Comparator.comparingInt(Medium::getYear));
        mediums.forEach(Medium::printData);
    }

    public void writeMediums(String name) {
            mediums.forEach(Medium -> {
                try (FileOutputStream out = new FileOutputStream(name, true)) {
                    Medium.printData(out);
                } catch (IOException IOe) {
                    IOe.printStackTrace();
                }
            });
    }

    public Medium showYoungestMedium() {
        int releaseDate = 0;
        for (Medium medium : mediums) {
            if (releaseDate < medium.getYear()) releaseDate = medium.getYear();
        }
        for (Medium medium : mediums) {
            if (medium.getYear() == releaseDate) return medium;
        }

        return null;
    }

    public double avgReleaseDate() {
        double avgReleaseDate = 0;
        for (Medium medium : mediums) {
            avgReleaseDate += medium.getYear();
        }

        return avgReleaseDate / mediums.size();
    }

    public Iterator<Medium> iterator() {
        return mediums.iterator();
    }

    //Better would be using Files class and "copy()" method
    public static void copy(File from, File to) {
        RandomAccessFile rFileFrom;
        RandomAccessFile rFileTo;
        try {
            rFileFrom = new RandomAccessFile(from, "r");
            rFileTo = new RandomAccessFile(to, "rw");
            for (int i = 0; i < rFileFrom.length(); i++) {
                rFileTo.write(rFileFrom.read());
            }
            rFileFrom.close();
            rFileTo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void serialize(Object object, String filename) {
        try (FileOutputStream file = new FileOutputStream(filename, true); ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void serialize(ArrayList<Object> object, String filename) {
        object.forEach( subObject -> {
            try (FileOutputStream file = new FileOutputStream(filename, true); ObjectOutputStream out = new ObjectOutputStream(file)) {
                out.writeObject(subObject);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public Medium deserialize(String filename) {
        Medium readMedium = null;

        try (FileInputStream file = new FileInputStream(filename); ObjectInputStream in = new ObjectInputStream(file)) {
            readMedium = (Medium) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return readMedium;
    }

    public ArrayList<Medium> bulkDeserialize(String filename) {
        ArrayList<Medium> readMedium = null;

        try (FileInputStream file = new FileInputStream(filename); ObjectInputStream in = new ObjectInputStream(file)) {
            readMedium = (ArrayList<Medium>) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return readMedium;
    }

}
