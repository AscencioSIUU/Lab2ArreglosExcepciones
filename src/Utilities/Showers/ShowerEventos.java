package Utilities.Showers;

import BasicObjects.Evento;
import java.util.List;

public class ShowerEventos {
    private List<Evento> eventos;

    public ShowerEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public void ShowInformation() {
        System.out.println("Información de Eventos:");
        System.out.println("| ID del Evento | ID del Recinto | Artista | Fecha | Hora | Duración | Cantidad de Asistentes |");

        for (Evento evento : eventos) {
            System.out.printf("|%-14s |%-16s |%-8s |%-6s |%-5s |%-9s |%-22s |%n",
                evento.id_evento, evento.id_recinto, evento.Artista, evento.Fecha, evento.Hora,
                evento.Duracion, evento.Cantidad_Asistentes);
        }

        // Agregar logs para depurar
        System.out.println("Número de eventos en la lista: " + eventos.size());
        for (Evento evento : eventos) {
            System.out.println("ID del Evento: " + evento.id_evento);
            // Agregar más logs para mostrar otros valores de los eventos
        }
    }
}
