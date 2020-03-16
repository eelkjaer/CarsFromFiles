package model;

public class Controller {

    public Controller(){

    }

    public void importCars(String filePath, Garage garage, boolean printResult){
        ImportCarsFromFile importFile = new ImportCarsFromFile();

        try {
            importFile.importCarsFromFile(filePath,garage);
        } catch (Exception e){
            System.out.println("ERROR: " + e.toString());
        }

        if(printResult){
            System.out.println(garage);
        }
    }

    public void exportCars(String filePath, int filter, Garage garage){
        ExportCarsToFile exportFile = new ExportCarsToFile();
        try {
            exportFile.exportCarsToFile(filePath,filter,garage);
        } catch (Exception e){
            System.out.println("ERROR: " + e.toString());
        }
    }

}
