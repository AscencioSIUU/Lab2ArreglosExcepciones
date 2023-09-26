package Askers;
import java.util.Scanner;
import java.util.ArrayList;
import BasicObjects.*;

public class DataAskRecinto {

    public static void DataAsk(ArrayList<Recinto> recintos, ArrayList<Evento> eventos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese los siguientes datos para crear un recinto:");

        System.out.print("Nombre del recinto: ");
        String nombre = scanner.nextLine();

        System.out.print("ID del país: ");
        String id_pais = scanner.nextLine();

        System.out.print("ID del recinto: ");
        String id_recinto = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        String capacidad = "";


        // Solicitar la capacidad hasta que se ingrese un valor válido
        while (true) {
            System.out.print("Capacidad: ");
            capacidad = scanner.nextLine();

            if (esNumero(capacidad)) {
                break; // Salir del bucle si se ingresó un valor válido
            } else {
                System.out.println("La capacidad debe ser un número entero válido. Intente nuevamente.");
            }
        }

        // Solicitar al usuario agregar eventos al recinto
        while (true) {
            System.out.println("\n¿Desea agregar un evento al recinto? (S/N): ");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("s")) {
                DataAskEvento.DataAsk(eventos);
            } else if (respuesta.equals("n")) {
                break;
            } else {
                System.out.println("Respuesta inválida. Por favor, ingrese 'S' para agregar un evento o 'N' para salir.");
            }
        }

        recintos.add(new Recinto(id_pais, id_recinto, capacidad, nombre, direccion)); 
    }

    // Función para validar si una cadena es un número válido
    public static boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
