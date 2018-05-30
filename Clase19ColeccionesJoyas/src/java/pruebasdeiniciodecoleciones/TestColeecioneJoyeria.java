package pruebasdeiniciodecoleciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TestColeecioneJoyeria {

    public static void main(String[] args) {
        System.out.println("[..] Coleciones Joyas");

        String perlita = "Perlas";
        String gemas = "Gema";
        String oro = "Oro 18k";
        String ruby = "Ruby";

        ArrayList<String> stock = new ArrayList();
//        TreeSet<String> stock = new TreeSet();

        System.out.println("cuantos: " + stock.size() + " : " + stock);

        stock.add(oro);
        System.out.println("1. ----------------");
        System.out.println("cuantos: " + stock.size() + " : " + stock);

        stock.add(ruby);
        stock.add(perlita);
        stock.add(gemas);
        stock.add(perlita);
        stock.add(oro);
//       stock.add(500);
//       stock.add(148);
        stock.add(ruby);

        System.out.println("2. ----------------");
        System.out.println("cuantos: " + stock.size() + " : " + stock);

//        for( int i = 0; i < stock.size(); i++ ){
        for( String joyaActual : stock){
            System.out.println("" + joyaActual);
        }
        
        System.out.println("3. ----------------");
        System.out.println("cuantos: " + stock.size() + " : " + stock);
        
        Collections.sort(stock);
        
        System.out.println("4. ----------------");
        System.out.println("cuantos: " + stock.size() + " : " + stock);

        System.out.println("[OK] Coleciones Joyas");
    }

}
