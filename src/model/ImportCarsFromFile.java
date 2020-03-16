package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportCarsFromFile {
    ArrayList<Garage> garages = new ArrayList<>();
    public ArrayList<Garage> importCarsFromFile(String filename, Garage garage) throws FileNotFoundException {
        //Obs;Make;Model;Cylinders;Horsepower;MPG_City;MPG_Highway;Weight;Wheelbase;Year;Milage
        //3;Acura;TSX 4dr;4;200;22;29;3230;105,2018,7932

        File fh = new File(filename);
        int numberofCars = 0;
        if (fh.exists()) {
            Scanner file = new Scanner(fh);
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] lineArr = line.split(";");
                try {
                    Bil tmpBil = new Bil(lineArr[1], lineArr[2], Integer.parseInt(lineArr[3]), Integer.parseInt(lineArr[4]), Integer.parseInt(lineArr[5]),
                            Integer.parseInt(lineArr[6]), Double.parseDouble(lineArr[7]), Integer.parseInt(lineArr[8]), Integer.parseInt(lineArr[9]),
                            Double.parseDouble(lineArr[10]));
                    garage.addCarToGarage(tmpBil);

                    numberofCars++;
                } catch (Exception e){
                    System.out.println("ERROR: " + e.toString());
                }
            }
        }
        return garages;
    }
}
