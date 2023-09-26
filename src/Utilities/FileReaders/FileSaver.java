// package Utilities.FileReaders;


// import BasicObjects.Evento;
// import BasicObjects.Recinto;


// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.ArrayList;

// public class FileSaver {

//     public static void SaveEventosToFile(ArrayList<Evento> eventos) {
//         try {
//             FileWriter csvWriter = new FileWriter("src/DB/Eventos.csv");
//             for (Evento evento : eventos) {
//                 csvWriter.append(evento.id_evento + "," + evento.id_recinto + "," + evento.Artista + "," + evento.Fecha + ","
//                         + evento.Hora + "," + evento.Duracion + "," + evento.Cantidad_Asistentes + "\n");
//             }
//             csvWriter.flush();
//             csvWriter.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     public static void SaveRecintosToFile(ArrayList<Recinto> recintos) {
//         try {
//             FileWriter csvWriter = new FileWriter("src/DB/Recintos.csv");
//             for (Recinto recinto : recintos) {
//                 csvWriter.append(recinto.id_pais + "," + recinto.id_recinto + "," + recinto.capacidad + "," + recinto.nombre + ","
//                         + recinto.direccion + "\n");
//             }
//             csvWriter.flush();
//             csvWriter.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
