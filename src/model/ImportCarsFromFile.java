package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportCarsFromFile {
    public int importCarsFromFile(String filename, Garage garage) throws FileNotFoundException {
        //Make;Model;Horsepower;MPG_City
        //Acura;MDX;265;17

        File fh = new File(filename);
        int numberofCars = 0;
        if (fh.exists()) {
            Scanner file = new Scanner(fh);
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] lineArr = line.split(";");
                try {
                    Bil tmpBil = new Bil(lineArr[0],lineArr[1],Integer.parseInt(lineArr[2]),Integer.parseInt(lineArr[3]));
                    garage.addCarToGarage(tmpBil);
                    numberofCars++;
                } catch (Exception e){
                    System.out.println("ERROR: " + e.toString());
                }
            }
        }
        return numberofCars;
    }
}
