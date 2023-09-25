package Askers;
import java.util.Scanner;

public class DataAskRecinto {
    public static void CrearRecintos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese los siguientes datos para crear un recinto:");

        System.out.print("Nombre del recinto: ");
        String nombre = scanner.nextLine();

        System.out.print("ID del país: ");
        int id_pais = scanner.nextInt();

        System.out.print("ID del recinto: ");
        int id_recinto = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Capacidad: ");
        int capacidad = scanner.nextInt();

        

        // Solicitar al usuario agregar eventos al recinto
        while (true) {
            System.out.println("\n¿Desea agregar un evento al recinto? (S/N): ");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("s")) {
                DataAskEvento.ingresarDatosEvento(scanner);
               
            } else if (respuesta.equals("n")) {
                break;
            } else {
                System.out.println("Respuesta inválida. Por favor, ingrese 'S' para agregar un evento o 'N' para salir.");
            }
        }
    }
}