package UI;
import BasicObjects.Evento;
import BasicObjects.Recinto;
import Utilities.Assigner;
import Utilities.FileReaders.FileReaderEventos;
import Utilities.FileReaders.FileReaderRecinto;
import Utilities.Seachers.EventosSearcher;
import Utilities.Seachers.RecintoSearcher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws IOException {
        EventosSearcher eventosSearcher = new EventosSearcher();
        RecintoSearcher recintoSearcher = new RecintoSearcher();
        
        FileReaderRecinto.loadFile(recintoSearcher);
        FileReaderEventos.loadFile(eventosSearcher);

        for (Evento evento : eventosSearcher.eventos) {
            for (Recinto recinto : recintoSearcher.recintos) {
                Assigner.AssignEventoToRecinto(evento, recinto);
            }
        }
        
        // TODO: Cargar archivos pero con los FileReaders PORQUE LMAO

        Scanner scanner = new Scanner(System.in);

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

            switch (opcion) {
                case 1:
                    // Asignar eventos a recintos
                    System.out.println("Asignación de eventos a recintos:");
                    break;
                case 2:
                    // Generar informe
                    System.out.println("\nInforme:");
                    System.out.println("1. Listado de eventos que no se les pudo asignar recinto:");

                    System.out.println("\n2. Listado de eventos a los que sí se les pudo asignar recinto:");


                    // Exportar resultado
                    System.out.println("\n3. Exportar resultado:");
                    System.out.print("Ingrese el nombre del archivo de exportación: ");
                    String nombreArchivo = scanner.nextLine();
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
