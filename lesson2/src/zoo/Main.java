package zoo;

import fileManager.ZooDataManager;

public class Main {
    public static void main(String[] args) {
        ZooNoise zoo = new ZooNoise();
        ZooDataManager zooDataManager = new ZooDataManager();

        String filename = "zoo_data.txt";
        zooDataManager.saveZooData(filename, zoo);

        zooDataManager.loadZooData(filename);
    }
}
