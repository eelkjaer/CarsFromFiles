import model.*;
public class Main {

    public static void main(String[] args) {
        Controller view = new Controller();
        Garage garage = new Garage("Lyngbys Bedste Garage");

        view.importCars("Data/cars2.csv", garage, true);
        view.exportCars("Data/exported.txt",2,garage);


    }


}
