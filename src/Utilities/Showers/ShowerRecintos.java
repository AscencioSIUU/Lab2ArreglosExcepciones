package Utilities.Showers;

import BasicObjects.Recinto;
import java.util.List;

public class ShowerRecintos {
    private List<Recinto> recintos;

    public ShowerRecintos(List<Recinto> recintos) {
        this.recintos = recintos;
    }

    public void ShowInformation() {
        System.out.println("Información de Recintos:");
        System.out.println("| Nombre del Recinto | ID del País | ID del Recinto | Dirección | Capacidad |");

        for (Recinto recinto : recintos) {
            System.out.printf("|%-19s |%-12s |%-14s |%-9s |%-10s |%n",
                recinto.nombre, recinto.id_pais, recinto.id_recinto, recinto.direccion, recinto.capacidad);
        }
    }

    public void ShowRecintoInfoByID(int id) {
        for (Recinto recinto : recintos) {
            if (recinto.id_recinto == id) {
                System.out.println("Información del Recinto con ID " + id + ":");
                System.out.println("Nombre del Recinto: " + recinto.nombre);
                System.out.println("ID del País: " + recinto.id_pais);
                System.out.println("ID del Recinto: " + recinto.id_recinto);
                System.out.println("Dirección: " + recinto.direccion);
                System.out.println("Capacidad: " + recinto.capacidad);
                return;
            }
        }
        System.out.println("Recinto con ID " + id + " no encontrado.");
    }
}
