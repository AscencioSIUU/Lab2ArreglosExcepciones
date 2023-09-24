package Utilities.FileReaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import BasicObjects.Recinto;
import Utilities.Seachers.RecintoSearcher;

public class FileReaderRecinto {
    public static void loadFile(RecintoSearcher Recintos) throws IOException{
        BufferedReader csvReader = new BufferedReader(new FileReader("src/DB/Recintos.csv"));

        for (String row; (row = csvReader.readLine()) != null;) {
            String[] data = row.split(",");
            Recintos.CreateObjects(data);
        }
        csvReader.close();
    }

    public static void SaveFile(RecintoSearcher searchers) throws IOException{
        FileWriter csvWriter = new FileWriter("src/DB/Recintos.csv");
        List<Recinto> recintos = searchers.recintos;
        for(Recinto recinto : recintos){
            csvWriter.append(recinto.id_pais + "," + recinto.id_recinto + "," + recinto.capacidad + "," + recinto.nombre + "," + recinto.direccion + "\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }

   
}
