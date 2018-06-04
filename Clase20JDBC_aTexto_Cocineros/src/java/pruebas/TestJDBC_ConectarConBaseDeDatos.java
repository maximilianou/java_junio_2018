package pruebas;

//import java.sql.Connection;
//import com.mysql.jdbc.Connection;
import pruebas.entidades.dao.UtilitarioConsultaCocineros;

/**
 * <pre>
 * Clase JDBC
 * java.sql.DriverManager
 * java.sql.Connection
 * java.sql.PreparedStatement
 * java.sql.ResultSet
 * java.sql.SQLException
 *
 * // 1. Cargar el Driver para conectar con La Base de datos MariaDB
 * // 2. Conectar con la base de datos, al esquema chefs
 * // 3. Seleccionar de la tabla de la base de datos, cocineros
 * // 4. Obtener los datos seleccionas de la base, en Java
 * // 5. Mostrar en la pantalla, los datos que tenemos en Java
 * </pre>
 */
public class TestJDBC_ConectarConBaseDeDatos {

    public static void main(String[] args) {
        System.out.println("[..]  JDBC Inicianco.. ");
        System.out.println("" + UtilitarioConsultaCocineros.devolucion());
        System.out.println("[OK]  JDBC Inicianco.. ");
    }


}
