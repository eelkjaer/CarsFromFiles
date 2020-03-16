package model;

public class Bil {
    static int idCounter=0;
    int carid, carHp, carMpg, carDoors;
    String carMake, carModel;

    public Bil(String carMake, String carModel, int carHp, int carMpg) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carHp = carHp;
        this.carMpg = carMpg;
        this.carDoors = calcCarDoors(carModel);
        this.carid = idCounter;
        idCounter++;

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

    public int getCarid() {
        return carid;
    }

    public int getCarHp() {
        return carHp;
    }

    public int getCarMpg() {
        return carMpg;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarDoors(){
        return carDoors;
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
        return "\nBil " + carid + " {\nMake: " + carMake + "\nModel: " + carModel + "\nCar doors: "+ carDoors +"\nHorsepower: " + carHp + "\nAvg. Mpg: " + carMpg + " }\n";
    }
}
