import model.*;
public class Main {

    public static void main(String[] args) {
        String filePath="Data/cars1.csv";

        Garage garage1 = new Garage("Lyngbys Bedste Garage");

        ImportCarsFromFile importFile = new ImportCarsFromFile();

        try {
            importFile.importCarsFromFile(filePath,garage1);
        } catch (Exception e){
            System.out.println("ERROR: " + e.toString());
        }

        System.out.println(garage1);
    }
}
