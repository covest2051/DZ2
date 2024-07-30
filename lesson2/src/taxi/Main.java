package taxi;


import fileManager.FileManager;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.callTaxi(new Friend());

        FileManager fileManager = new FileManager();

        String filename = "taxi_info.txt";
        String dataToWrite = "Такси вызвано на адрес: Ленина, 55";
        fileManager.writeToFile(filename, dataToWrite);

        String dataRead = fileManager.readFromFile(filename);
        System.out.println("Содержимое файла: " + dataRead);
    }
}
