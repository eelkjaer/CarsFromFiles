package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportCarsToFile {
    public int exportCarsToFile(String fileName, int filter, Garage garage){
        ArrayList<Bil> tmpArray = new ArrayList<>();
        String content = "";

        if(filter==1){
            for(Bil b:garage.garage){
                if(b.carMake.contains("Volvo")){
                    tmpArray.add(b);
                }
            }
            content += tmpArray.toString();
        } else if (filter==2){
            for(Bil b:garage.garage){
                if(b.carMpg >= 20){
                    tmpArray.add(b);
                }
            }
            content += tmpArray.toString();
        } else if (filter==3){
            for(Bil b:garage.garage){
                if(b.carMpg >= 20 && b.carHp<200){
                    tmpArray.add(b);
                }
            }
            content += tmpArray.toString();
        } else {
            tmpArray.addAll(garage.garage);
            content += tmpArray.toString();
        }


        try (FileWriter writer = new FileWriter(fileName);
             BufferedWriter bw = new BufferedWriter(writer)) {

            bw.write(content);

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        return 0;
    }
}
