package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CocinerosDAO {
    // 1. metodo de consulta, para el SELECT
    // 2. metodo de insercion para el INSERT
    // 3. metodo de actualizadicon para el UPDATE
    // 4. metodo de borrado para el DELETE
    // 5. metodo de borrado logico para ejercicio

    public static ArrayList<Cocinero> consultar() throws Exception {
        ArrayList<Cocinero> listita = new ArrayList();
        // aqui programare consultando con SELECT la base 
        // y CREANDO Objetos Cocinero
        // agtegandolos a listita
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/chefs",
                "educacion",
                "educacion");
        PreparedStatement sentencia = conectar.prepareStatement(
                " SELECT * FROM cocineros ");
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) {
            Cocinero uno = new Cocinero();
            uno.setId(resultado.getString("coc_id"));
            uno.setNombre(resultado.getString("coc_nombre"));
            listita.add(uno);
        }
        return listita;
    }
    public static void insertar( Cocinero arielParametro ) throws Exception{
        
    }
    public static void actualizar( Cocinero arielParametro ) throws Exception{
        
    }
    public static void borrar( Cocinero arielParametro ) throws Exception{
        
    }
    public static void bajaLogica( Cocinero arielParametro ) throws Exception{
        
    }
    public static void recuperoLogica( Cocinero arielParametro ) throws Exception{
        
    }
    
}
