package model;
import java.util.ArrayList;

public class Garage {
    static int garageId=0;
    int garageInstId;
    String garageName;
    ArrayList<Bil> garage;

    public Garage(String name){
        garage = new ArrayList<>();
        this.garageName = name;
        this.garageInstId = garageId;
        garageId++;
    }

    public void addCarToGarage(Bil bil){
        if(garage.contains(bil)){
            System.out.println("Car already in garage.");
        } else {
            garage.add(bil);
        }
    }

    @Override
    public String toString(){
        return "Garage " + this.garageInstId + " ("+this.garageName+")\nCars: " + garage;
    }
}
