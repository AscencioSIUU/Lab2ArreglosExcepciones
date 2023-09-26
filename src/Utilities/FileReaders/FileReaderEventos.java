package Utilities.FileReaders;
import BasicObjects.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import Utilities.Seachers.EventosSearcher;

public class FileReaderEventos{
    

    public static void loadFile(EventosSearcher Eventos) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("src/DB/Eventos.csv"));
        
        // Leer y descartar la primera línea que contiene los encabezados
        String headerLine = csvReader.readLine();
        
        for (String row; (row = csvReader.readLine()) != null;) {
            String[] data = row.split(",");
            Eventos.CreateObjects(data);
        }
        csvReader.close();
    }

    public static  void SaveFile(EventosSearcher searchers) throws IOException{
        FileWriter csvWriter = new FileWriter("src/DB/Eventos.csv");
        List<Evento> eventos = searchers.eventos;
        for(Evento evento : eventos){
            csvWriter.append(evento.id_evento + "," + evento.id_recinto + "," + evento.Artista + "," + evento.Fecha + "," + evento.Hora + "," + evento.Duracion + "," + evento.Cantidad_Asistentes + "\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }


}
