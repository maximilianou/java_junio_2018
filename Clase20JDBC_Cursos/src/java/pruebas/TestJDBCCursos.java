package pruebas;

import java.sql.*;

/** <pre>
 * 0. cargar el Driver, del motor de base de datos especifico y version
 * 1. conectar con la base de datos
 * 2. obtener una sentencia para escribir el sql para la base de datos
 * 3. ejecutar el sql de la sentencia y obtener el resutlado
 * 4. imprimmir el resultado en la pantalla
 * 
 * </pre>
 */
public class TestJDBCCursos {
    public static void main(String[] args) {
        try {
            System.out.println("[..] JDBC ");
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("[OK] JDBC Driver Cargado !!!");

            Connection conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/academia_db"
//                    "jdbc:mysql://127.0.0.1/academia_db"
                    ,"educacion"
                    ,"educacion"
              );
            System.out.println("[OK] JDBC Conecto a DB !!! ");

            PreparedStatement sentencia = conectar.prepareStatement(
                    " SELECT * FROM cursos ");
            System.out.println("[OK] JDBC Sentencia Creada !!! ");
            
            ResultSet respuesta = sentencia.executeQuery();
            System.out.println("[OK] JDBC Consulta EJECUTADA !!! ");
            
            while( respuesta.next() ){
                System.out.println(""
                + respuesta.getString("cur_id")
                + ", "
                + respuesta.getString("cur_nombre")
                + ", "
                + respuesta.getString("cur_precio")
                + ", "
                + respuesta.getString("cur_cant_clases")
//                + ", "
//                + respuesta.getString(4)
//                + ", "
//                + respuesta.getString(5)
                );
            }
            
            System.out.println("[OK] JDBC ");
        //} catch (ClassNotFoundException ex) {
        } catch (Exception ex) {
            System.out.println("[ERROR] JDBC " + ex.getMessage());
        }
    }
}







