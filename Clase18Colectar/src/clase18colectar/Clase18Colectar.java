package clase18colectar;

import java.util.ArrayList;
import java.util.TreeSet;

public class Clase18Colectar {

    public static void main(String[] args) {
        System.out.println("[..] Colecciones!!");
        
//        ArrayList<String> listita = new ArrayList();
        TreeSet<String> listita = new TreeSet();

        System.out.println("cantidad: " + listita.size());
        System.out.println("" + listita);

        String jueguito = "tetris";
        String jueguito24 = "buscaminas";

        listita.add("damas");
        System.out.println("cantidad: " + listita.size());
        System.out.println("" + listita);

        listita.add(jueguito);
        listita.add(jueguito24);
        listita.add(jueguito);
        listita.add(jueguito);
//        listita.add( 88 );

        System.out.println("cantidad: " + listita.size());
        System.out.println("" + listita);

        System.out.println("1. --------------");
        for(String laActual : listita){
            System.out.println( "laActual:" + laActual );
        }
        System.out.println("2. --------------");

        System.out.println("[OK] Colecciones!!");
    }

}
