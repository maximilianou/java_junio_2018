package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * <pre> 
 * Clase JDBC
 * java.sql.DriverManager
 * java.sql.Connection
 * java.sql.PreparedStatement
 * java.sql.ResultSet
 * java.sql.SQLException
 * 
        // 1. Cargar el Driver para conectar con La Base de datos MariaDB
        // 2. Conectar con la base de datos, al esquema chefs
        // 3. Seleccionar de la tabla de la base de datos, cocineros
        // 4. Obtener los datos seleccionas de la base, en Java
        // 5. Mostrar en la pantalla, los datos que tenemos en Java
 * </pre>
 */
public class TestJDBC_ConectarConBaseDeDatos {
    public static void main(String[] args) {
        System.out.println("[..]  JDBC Inicianco.. ");
        try {
            // Cargamos el driver de Mariadb o Mysql
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("JDBC: Cargo el Driver OK");
            
            Connection conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/chefs",
                    "educacion",
                    "educacion");
            
//            Connection conectarLau = DriverManager.getConnection(
//                    "jdbc:mysql://192.168.2.2/chefs",
//                    "educacion",
//                    "educacion");
//            
//            Connection conectarIvan = DriverManager.getConnection(
//                    "jdbc:oracle://192.168.2.7/chefs",
//                    "educacion",
//                    "educacion");
            
            
            System.out.println("JDBC: Conectando a la Base OK");

            PreparedStatement sentencia = conectar.prepareStatement(
                    " SELECT * FROM cocineros ");
            System.out.println("JDBC: Cree la Sentencia OK");
            
            ResultSet resultado = sentencia.executeQuery();
            System.out.println("JDBC: Ejecute la Sentencia "
                             + " en la Base de Datos OK");
            
            while( resultado.next() ){
                System.out.println("" 
                        + resultado.getString(1)
                        + ", " 
                        + resultado.getString(2)
                        );
            }            
            System.out.println("JDBC: Resultados de la Base de datos OK");
            
        //} catch (ClassNotFoundException ex) {
        } catch (Exception ex) {
            System.out.println("JDBC: ERROR " + ex.getMessage() );
        }
        
        System.out.println("[OK]  JDBC Inicianco.. ");
    }
}






