package UI;
import BasicObjects.Evento;
import BasicObjects.Recinto;
import Utilities.Assigner;
import Utilities.Seachers.EventosSearcher;
import Utilities.Seachers.RecintoSearcher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        EventosSearcher eventosSearcher = new EventosSearcher();
        RecintoSearcher recintoSearcher = new RecintoSearcher();

        // TODO: Cargar archivos pero con los FileReaders PORQUE LMAO
        eventosSearcher.loadFile("eventos.csv");
        recintoSearcher.loadFile("recintos.csv");

        Scanner scanner = new Scanner(System.in);
        // YEP :D

        while (true) {
            // TODO: Corregir en la mayoria
            /*
             * TODO: Mostrar el menú principal
             * Necesita esto
             * 1. Agregar evento (Este va a un recinto y pide una confirmacion por medio del assigner)
             * 2. Agregar Recinto.
             * #Usar los Searchers para meter los recintos y cosas ahi
             * 3. poner una opcion para poder llamar a ShowerInforme.
             * 4. poner una opcion para poder llamar a ShowerInforme. (showers ernesto)
             * 5. Guarda La info.
             * y ya, solo, el resto que lo haga ernesto, mas que todo solo llama funciones aca
             * no hagas nada nuevis, solo llamarlas :D
             * 
             * Holis :D
             */
            System.out.println("Menú Principal:");
            System.out.println("1. Asignar eventos a recintos");
            System.out.println("2. Generar informe");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            //kkkkk

            switch (opcion) {
                case 1:
                    // Asignar eventos a recintos
                    System.out.println("Asignación de eventos a recintos:");
                    for (Evento evento : eventosSearcher.eventos) {
                        boolean asignado = Assigner.AssignEventoToRecinto(evento, );
                        if (asignado) {
                            System.out.println("Evento " + evento.id_evento + " asignado al recinto.");
                        } else {
                            System.out.println("No se pudo asignar recinto para el evento " + evento.id_evento + ".");
                        }
                    }
                    break;
                case 2:
                    // Generar informe
                    System.out.println("\nInforme:");
                    System.out.println("1. Listado de eventos que no se les pudo asignar recinto:");
                    List<Evento> eventosSinAsignar = AssignEventToRecinto.GetEventosSinAsignar(eventosSearcher.eventos);
                    for (Evento evento : eventosSinAsignar) {
                        System.out.println("Evento " + evento.id_evento + ": " + evento.Artista);
                    }

                    System.out.println("\n2. Listado de eventos a los que sí se les pudo asignar recinto:");
                    List<Evento> eventosAsignados = AssignEventToRecinto.GetEventosAsignados(eventosSearcher.eventos);
                    for (Evento evento : eventosAsignados) {
                        System.out.println("Evento " + evento.id_evento + ": " + evento.Artista);
                    }

                    // Exportar resultado
                    System.out.println("\n3. Exportar resultado:");
                    System.out.print("Ingrese el nombre del archivo de exportación: ");
                    String nombreArchivo = scanner.nextLine();
                    exportarResultado(nombreArchivo, eventosAsignados);
                    System.out.println("Resultado exportado correctamente.");
                    break;
                case 3:
                    // Salir del programa
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
