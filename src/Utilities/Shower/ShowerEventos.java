package Utilities.Shower;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Utilities.Seachers.EventosSearcher;

public class ShowerEventos {
    public void ShowInformation() throws IOException {
        String file = "src/DB/Eventos.csv";
        String delimiter = ",";

        try (BufferedReader csvReader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = csvReader.readLine()) != null) {
                String[] data = line.split(delimiter);
                System.out.printf("|%-20s |%-20s |%-20s |%-20s |%-20s |%-20s |%-20s%n", data[0], data[1], data[2],
                        data[3], data[4], data[5], data[6]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
