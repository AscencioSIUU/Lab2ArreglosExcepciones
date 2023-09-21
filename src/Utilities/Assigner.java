package Utilities;

import BasicObjects.*;

public abstract class Assigner {

    public static boolean AssignEventoToRecinto(Evento evento, Recinto recinto){
        if(recinto.capacidad == evento.Cantidad_Asistentes){
            for (Evento e : recinto.eventos){
                if (e.Fecha == evento.Fecha){
                    if (e.Hora == evento.Hora){
                        recinto.addEvento(evento);
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

}

