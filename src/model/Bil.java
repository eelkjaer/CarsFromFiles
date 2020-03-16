package model;

public class Bil {
    //Obs;Make;Model;Cylinders;Horsepower;MPG_City;MPG_Highway;Weight;Wheelbase;Year;Milage
    static int idCounter=0;
    int avgMpg;
    int carid, carHp, carMpgCity, carMpgHighway, carCylinders, carDoors, carWheelbase, carYear, garageId;
    double carMilage, carWeight;
    String carMake, carModel;

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

        return carid == bil.carid;
    }

    @Override
    public int hashCode() {
        return carid;
    }

    @Override
    public String toString() {
        return "\nBil " + carid
                + "\nGarage: " + garageId
                + " {\nMake: " + carMake
                + "\nModel: " + carModel
                + "\nYear: " + carYear
                + "\nMilage: " + carMilage
                + "\nCar doors: "+ carDoors
                + "\nCylinders: " + carCylinders
                +"\nHorsepower: " + carHp
                + "\nWeight: " + carWeight
                + "\nWheelbase: " + carWheelbase
                + "\nMpg(City): " + carMpgCity
                + "\nMpg (Highway): " + carMpgHighway
                + "\nAverage Mpg: " + avgMpg
                + " }\n";
    }
}
