package Askers;
import java.util.Scanner;

import javax.xml.crypto.Data;
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
        scanner.nextLine(); 

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Capacidad: ");
        String capacidad = scanner.nextLine();

        

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

        recintos.add(new Recinto(nombre, id_pais, id_recinto, direccion, capacidad));
    }
}