package model;

public class Bil {
    //Obs;Make;Model;Cylinders;Horsepower;MPG_City;MPG_Highway;Weight;Wheelbase;Year;Milage
    //Skipper headeren "Obs" i import.
    private static int idCounter=0;
    private int avgMpg;
    private int carid, carHp, carMpgCity, carMpgHighway, carCylinders, carDoors, carWheelbase, carYear, garageId;
    private double carMilage, carWeight;
    private String carMake, carModel;

    public Bil(String carMake, String carModel, int carCylinders, int carHp, int carMpgCity, int carMpgHighway,
                double carWeight, int carWheelbase,
                int carYear, double carMilage) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carCylinders = carCylinders;
        this.carHp = carHp;
        this.carMpgCity = carMpgCity;
        this.carMpgHighway = carMpgHighway;
        this.carWeight = carWeight;
        this.carWheelbase = carWheelbase;
        this.carYear = carYear;
        this.carMilage = carMilage;
        this.carDoors = calcCarDoors(carModel);
        this.carid = idCounter;
        this.avgMpg = avgMpg(carMpgCity, carMpgHighway);
        idCounter++;

    }

    private int avgMpg(double cityMpg, double highwayMpg){
        double calcMpg = (highwayMpg+cityMpg) / 2;

        return (int)calcMpg;
    }

    private int calcCarDoors(String modelDesc){
        if(modelDesc.contains("4dr")){
            return 4;
        } else if(modelDesc.contains("2dr")){
            return 2;
        } else {
            return 0;
        }
    }

    public int getAvgMpg() {
        return avgMpg;
    }

    public int getCarHp() {
        return carHp;
    }

    public int getCarMpgCity() {
        return carMpgCity;
    }

    public int getCarMpgHighway() {
        return carMpgHighway;
    }

    public int getCarDoors() {
        return carDoors;
    }

    public int getCarYear() {
        return carYear;
    }

    public double getCarMilage() {
        return carMilage;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getGarageId() {
        return garageId;
    }

    public void setGarageId(int garageId) {
        this.garageId = garageId;
    }

    public int getCarid() {
        return carid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bil bil = (Bil) o;

        return this.carid == bil.carid;
    }

    @Override
    public int hashCode() {
        return this.carid;
    }

    @Override
    public String toString() {
        return "\nBil " + this.carid
                + "\nGarage: " + this.garageId
                + " {\nMake: " + this.carMake
                + "\nModel: " + this.carModel
                + "\nYear: " + this.carYear
                + "\nMilage: " + this.carMilage
                + "\nCar doors: "+ this.carDoors
                + "\nCylinders: " + this.carCylinders
                +"\nHorsepower: " + this.carHp
                + "\nWeight: " + this.carWeight
                + "\nWheelbase: " + this.carWheelbase
                + "\nMpg(City): " + this.carMpgCity
                + "\nMpg (Highway): " + this.carMpgHighway
                + "\nAverage Mpg: " + this.avgMpg
                + " }\n";
    }
}
