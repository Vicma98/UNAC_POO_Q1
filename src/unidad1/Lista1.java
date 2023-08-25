package unidad1;

import java.util.ArrayList;

public class Lista1 {
    static ArrayList<Lugares> crearLista(String Lugar){
        ArrayList<Lugares> listalugares = new ArrayList<>();
        String[] Lugares= Lugar.split(";");
        Lugares l;
        String[] atributos;
        for (int i = 0; i < Lugares.length; i++) {
            atributos=Lugares[i].split(",");
            l= new Lugares(atributos[0], atributos[1],atributos[2],atributos[3]);
            listalugares.add(l);
        }
        return listalugares;

    }
}
