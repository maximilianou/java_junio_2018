package pruebas;

import com.google.gson.Gson;
import java.util.*;

public class TestDAO_JSON {
    public static void main(String[] args) {
        System.out.println("[..] Consulta Crussos");
        //1.  encaro el DAO, data access object, accede a datos y devuelve Objetos
        // el DAO encapsula el SQL, asi solo el se dedica a SQL
        ArrayList<Curso> listita = CursosDAO.consultar();
        System.out.println("imprime asi nomas: " + listita);
        System.out.println("imprime asi nomas: " + listita);
        System.out.println("imprime asi nomas: " + listita);
        //2. Convertir a JSON el resultado
        // Imprimirlo, en la salida de text del Test
        Gson convertir = new Gson();
        String listitaTEXTO = convertir.toJson(listita );
        System.out.println("" + listitaTEXTO);
        
        System.out.println("[OK] Consulta Crussos");
    }
}
