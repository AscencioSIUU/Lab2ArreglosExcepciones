
package Askers;
import java.util.Scanner;
import BasicObjects.Evento;

public class DataAskEvento {
    public static Evento ingresarDatosEvento(Scanner scanner) {
        System.out.println("Por favor, ingrese los siguientes datos para crear un evento:");

        System.out.print("ID del evento: ");
        int id_evento = scanner.nextInt();

        System.out.print("ID del recinto: ");
        int id_recinto = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Fecha (YYYY/MM/DD): ");
        String fecha = scanner.nextLine();

        System.out.print("Hora (HH:MM): ");
        String hora = scanner.nextLine();

        System.out.print("Duración (en minutos): ");
        int duracion = scanner.nextInt();

        System.out.print("Cantidad de asistentes: ");
        int cantidad_Asistentes = scanner.nextInt();

        return null; // Cambia esto para devolver el objeto Evento adecuado
    }
}
       