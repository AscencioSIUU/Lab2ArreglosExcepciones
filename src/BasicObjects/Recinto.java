package BasicObjects;
import java.util.ArrayList;

public class Recinto extends Objecto{
    public String nombre;
    public int id_pais;
    public int id_recinto;
    public String direccion;
    public int capacidad;
    public ArrayList<Evento> eventos = new ArrayList<Evento>();


    public Recinto(String id_pais, String id_recinto, String capacidadInt, String nombre, String direccion){
        this.id_pais = Integer.parseInt(id_pais);
        this.id_recinto = Integer.parseInt(id_recinto);
        this.capacidad = Integer.parseInt(capacidadInt);
        this.nombre = nombre;
        this.direccion = direccion;
    }


    public void addEvento(Evento evento){
        this.eventos.add(evento);
    }




}