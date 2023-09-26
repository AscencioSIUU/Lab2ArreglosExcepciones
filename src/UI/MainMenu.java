package UI;

import Utilities.FileReaders.FileReaderRecinto;
import Utilities.Seachers.EventosSearcher;
import Utilities.Seachers.RecintoSearcher;
import BasicObjects.Evento;
import BasicObjects.Recinto;
import Askers.DataAskEvento;
import Askers.DataAskRecinto;
import Utilities.Showers.ShowerEventos;
import Utilities.Showers.ShowerRecintos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
                    // Generar informe de eventos por ID
                    System.out.print("Ingrese el ID del evento que desea buscar: ");
                    int idEventoBuscado = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea

                    boolean encontrado = false;
                    for (Evento evento : eventos) {
                        if (evento.id_evento == idEventoBuscado) {
                            new ShowerEventos(List.of(evento)).ShowInformation(); // Muestra solo el evento encontrado
                            encontrado = true;
                            break; // Salir del bucle si se encuentra el evento
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Evento no encontrado con el ID proporcionado.");
                    }
                    break;
                    case 4:
                    // Generar informe de recintos
                    try {
                        FileReaderRecinto.loadFile(recintoSearcher);
                        new ShowerRecintos(recintos).ShowInformation();
                
                        // Solicitar al usuario que introduzca el ID del recinto a buscar
                        Scanner inputScanner = new Scanner(System.in);
                        System.out.print("Introduce el ID del recinto a buscar: ");
                        int idRecintoBuscado = inputScanner.nextInt();
                
                        // Llamar al método para mostrar información del recinto por ID
                        new ShowerRecintos(recintos).ShowRecintoInfoByID(idRecintoBuscado);
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
