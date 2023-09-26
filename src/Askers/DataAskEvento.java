package Askers;
import java.util.Scanner;
import java.util.ArrayList;
import BasicObjects.Evento;




public class DataAskEvento {
    public static void DataAsk(ArrayList<Evento> eventos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese los siguientes datos para crear un evento:");

        System.out.print("ID del evento: ");
        String id_evento = scanner.nextLine();

        // Verificar si ya existe un evento con el mismo ID
        boolean existeEvento = eventos.stream().anyMatch(e -> e.id_evento == Integer.parseInt(id_evento));
        if (existeEvento) {
            System.out.println("Ya existe un evento con el mismo ID. No se puede agregar.");
            return; // Salir sin agregar el evento duplicado
        }
                if (existeEvento) {
            System.out.println("Ya existe un evento con el mismo ID. No se puede agregar.");
            return; // Salir sin agregar el evento duplicado
        }

        // Continuar solicitando otros datos y agregar el evento si no hay duplicados
        System.out.print("ID del recinto: ");
        String id_recinto = scanner.nextLine();

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
