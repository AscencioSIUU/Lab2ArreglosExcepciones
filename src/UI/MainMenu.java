package UI;

import Utilities.FileReaders.FileReaderEventos;
import Utilities.FileReaders.FileReaderRecinto;
import Utilities.Seachers.EventosSearcher;
import Utilities.Seachers.RecintoSearcher;
import BasicObjects.Evento;
import BasicObjects.Recinto;
import Askers.DataAskEvento;
import Askers.DataAskRecinto;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        // Listas para almacenar eventos y recintos
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Recinto> recintos = new ArrayList<>();

        // Objeto para realizar búsquedas de eventos y recintos
        EventosSearcher eventosSearcher = new EventosSearcher();
        RecintoSearcher recintoSearcher = new RecintoSearcher();

        // Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Agregar evento");
            System.out.println("2. Agregar Recinto");
            System.out.println("3. Generar informe de eventos");
            System.out.println("4. Generar informe de recintos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    // Agregar evento
                    DataAskEvento.DataAsk(eventos);
                    break;
                case 2:
                    // Agregar Recinto
                    DataAskRecinto.DataAsk(recintos, eventos);
                    break;
                case 3:
                    // Generar informe de eventos
                    try {
                        FileReaderEventos.loadFile(eventosSearcher);
                        new ShowerEventos().ShowInformation();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    // Generar informe de recintos
                    try {
                        FileReaderRecinto.loadFile(recintoSearcher);
                        new ShowerRecintos().ShowInformation();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    // Salir del programa
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}
