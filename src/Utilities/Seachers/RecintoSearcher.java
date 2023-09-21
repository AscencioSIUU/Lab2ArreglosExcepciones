package Utilities.Seachers;
import BasicObjects.*;

import java.util.ArrayList;

public class RecintoSearcher extends Searcher {
    public ArrayList<Recinto> recintos = new ArrayList<Recinto>();

    @Override
    public Recinto Search(int id){
        for(Recinto recinto : recintos){
            if(recinto.id_recinto == id){
                return recinto;
            }
        }
        return null; 
    }

    @Override
    public Recinto CreateObjects(String[] data){
        Recinto recinto = new Recinto(data[0], data[1], data[2], data[3], data[4]);
        recintos.add(recinto);
        return recinto;
    }
}
