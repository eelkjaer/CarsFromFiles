import model.*;
public class Main {

    public static void main(String[] args) {
        Controller view = new Controller();
        Garage garage1 = new Garage("Lyngbys Bedste Garage");

        view.importCars("Data/cars2.csv", garage1, true);
        view.exportCars("Data/exported.txt",3,garage1);


    }


}
