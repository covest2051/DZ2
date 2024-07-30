package fileManager;

import java.io.Serializable;

public interface FileOperations extends Serializable {
    void writeToFile(String filename, String data);
    String readFromFile(String filename);
}

