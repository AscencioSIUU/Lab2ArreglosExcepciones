package BasicObjects;

public class Evento extends Objecto{
    public int id_evento;
    public int id_recinto;
    public String Artista;
    public String Fecha; // (YYYY/MM/DD)
    public String Hora; // (HH:MM)
    public int Duracion;
    public int Cantidad_Asistentes;

    public Evento(String id_evento, String id_recinto, String Artista, String Fecha, String Hora, String Duracion, String Cantidad_Asistentes){
        this.id_evento = Integer.parseInt(id_evento);
        this.id_recinto = Integer.parseInt(id_recinto);
        this.Artista = Artista;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Duracion = Integer.parseInt(Duracion);
        this.Cantidad_Asistentes = Integer.parseInt(Cantidad_Asistentes);
    }

}
