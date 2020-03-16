package model;

public class Bil {
    static int idCounter=0;
    int carid, carHp, carMpg;
    String carMake, carModel;

    public Bil(String carMake, String carModel, int carHp, int carMpg) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carHp = carHp;
        this.carMpg = carMpg;
        this.carid = idCounter;
        idCounter++;

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
        return "\nBil " + carid + " {\nMake: " + carMake + "\nModel: " + carModel + "\nHorsepower: " + carHp + "\nMpg: " + carMpg + " }\n";
    }
}
