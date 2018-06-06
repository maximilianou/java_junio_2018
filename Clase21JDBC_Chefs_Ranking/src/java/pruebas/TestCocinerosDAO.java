package pruebas;

import java.sql.*;
import java.util.ArrayList;

/**
 * <pre>
 * // 0. Cargar el Driver para conectar a la base de datos MariaDB(Mysql)
 * // 1. Conectar con la base de datos, esquema chefs
 * // 2. Crear la Sentencia SQL, para SELECT * from cocineros
 * // 3. Obtener el resultado en un ResultSet con los datos de la base
 * // 4. Imprimir en pantalla, por ahora, los datos de la base
 *
 * // 5. Insertar ( INSERT )
 * // 6. Borrar ( DELETE )
 * // 7. Actualizar ( UPDATE )
 * // 8. Baja Logica ( UPDATE, que deshabilite para que no se vea, ingenienselas!!!)
 * </pre>
 */
public class TestCocinerosDAO {

    public static void probarBase() throws Exception {
        System.out.println("[..] Probar Base ()");
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/chefs",
                "educacion",
                "educacion");
        System.out.println("JDBC Conectado OK");

        PreparedStatement sentencia = conectar.prepareStatement(
                " SELECT * FROM cocineros ");
        System.out.println("JDBC Sentencia OK");

        ResultSet resultado = sentencia.executeQuery();
        System.out.println("JDBC Obtuve el Resultado OK");

        while (resultado.next()) {
            System.out.println("Cocinero : "
                    + resultado.getString("coc_id")
                    + ", "
                    + resultado.getString("coc_nombre")
            );
        }
        System.out.println("JDBC Fin Impresion OK");

        System.out.println("[OK] Probar Base ()");
    }

    public static void main(String[] args) {
        try {
            System.out.println("[..] ABM o CRUD de base de datos desde Java");

            //probarBase();
            
            ArrayList<Cocinero> lista = CocinerosDAO.consultar();
            System.out.println("" + lista);
            
            System.out.println("<ol>");
            for( Cocinero otro : lista){
                System.out.println("<li>"+ otro +"</li>");
            }
            System.out.println("</ol>");

            System.out.println("[OK] ABM o CRUD de base de datos desde Java");
        } catch (Exception ex) {
            System.out.println("[ERROR] ABM o CRUD " + ex.getMessage());
        }
    }

}




