
package Askers;
import java.util.Scanner;
import BasicObjects.Evento;
import java.util.ArrayList;
public class DataAskEvento {
    public static void DataAsk(ArrayList<Evento> eventos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese los siguientes datos para crear un evento:");

        System.out.print("ID del evento: ");
        String id_evento = scanner.nextLine();

        System.out.print("ID del recinto: ");
        String id_recinto = scanner.nextLine();
        scanner.nextLine(); 

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Fecha (YYYY/MM/DD): ");
        String fecha = scanner.nextLine();

        System.out.print("Hora (HH:MM): ");
        String hora = scanner.nextLine();

        System.out.print("Duración (en minutos): ");
        String duracion = scanner.nextLine();

        System.out.print("Cantidad de asistentes: ");
        String cantidad_Asistentes = scanner.nextLine();

        eventos.add(new Evento(id_evento, id_recinto, artista, fecha, hora, duracion, cantidad_Asistentes));

    }

}
       