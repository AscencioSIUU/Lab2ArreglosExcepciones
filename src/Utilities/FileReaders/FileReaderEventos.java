package Utilities.FileReaders;
import BasicObjects.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import Utilities.Seachers.*;

public class FileReaderEventos{
    

    public void loadFile() throws IOException{
        BufferedReader csvReader = new BufferedReader(new FileReader("src/DB/Eventos.csv"));

        for (String row; (row = csvReader.readLine()) != null;) {
            String[] data = row.split(",");
            EventosSearcher eventoSearcher = new EventosSearcher();
            eventoSearcher.CreateObjects(data);
        }
        csvReader.close();
    }

    public void SaveFile(EventosSearcher searchers) throws IOException{
        FileWriter csvWriter = new FileWriter("src/DB/Eventos.csv");
        List<Evento> eventos = searchers.eventos;
        for(Evento evento : eventos){
            csvWriter.append(evento.id_evento + "," + evento.id_recinto + "," + evento.Artista + "," + evento.Fecha + "," + evento.Hora + "," + evento.Duracion + "," + evento.Cantidad_Asistentes + "\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }


}
