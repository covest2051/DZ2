package fileManager;

import zoo.Speakable;
import zoo.ZooNoise;

public class ZooDataManager {
    private FileManager fileManager;

    public ZooDataManager() {
        fileManager = new FileManager();
    }

    public void saveZooData(String filename, ZooNoise zooNoise) {
        StringBuilder data = new StringBuilder();
        for (Speakable speakable : zooNoise.getNoise()) {
            data.append(speakable.getClass().getSimpleName()).append(" издает звук: ");
            speakable.speak(); // Печатает звук на консоль
            data.append(System.lineSeparator());
        }
        fileManager.writeToFile(filename, data.toString());
    }

    public void loadZooData(String filename) {
        String data = fileManager.readFromFile(filename);
        System.out.println("Содержимое файла зоопарка: ");
        System.out.println(data);
    }
}

