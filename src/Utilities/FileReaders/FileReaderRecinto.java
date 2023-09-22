package Utilities.FileReaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import BasicObjects.Recinto;
import Utilities.Seachers.RecintoSearcher;

public class FileReaderRecinto {
    public void loadFile() throws IOException{
        BufferedReader csvReader = new BufferedReader(new FileReader("src/DB/Recintos.csv"));

        for (String row; (row = csvReader.readLine()) != null;) {
            String[] data = row.split(",");
            RecintoSearcher recintoSearcher = new RecintoSearcher();
            recintoSearcher.CreateObjects(data);
        }
        csvReader.close();
    }

    public void SaveFile(RecintoSearcher searchers) throws IOException{
        FileWriter csvWriter = new FileWriter("src/DB/Recintos.csv");
        List<Recinto> recintos = searchers.recintos;
        for(Recinto recinto : recintos){
            csvWriter.append(recinto.id_pais + "," + recinto.id_recinto + "," + recinto.capacidad + "," + recinto.nombre + "," + recinto.direccion + "\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }

   
}
