package PlaceholderDB;

import Data.Medium;

import java.util.ArrayList;

// Note, FileInputStream is too retarded to figure out any path. So the "Database" is in src folder as a File in this case.

public interface IDao {
    void speichern(ArrayList<Medium> liste, String filename);
    ArrayList<Medium> laden(String filename);
}
