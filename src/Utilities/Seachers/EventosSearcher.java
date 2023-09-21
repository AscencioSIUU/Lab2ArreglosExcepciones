package Utilities.Seachers;
import BasicObjects.*;

import java.util.ArrayList;


public class EventosSearcher extends Searcher {
    public ArrayList<Evento> eventos = new ArrayList<Evento>();

    @Override
    public Evento Search(int id){
        for(Evento evento : eventos){
            if(evento.id_evento == id){
                return evento;
            }
        }
        return null; // add this line to handle the case where no Evento is found
    }

    @Override
    public Evento CreateObjects(String[] data){
        Evento evento = new Evento(data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
        eventos.add(evento);
        return evento;
    }
}
