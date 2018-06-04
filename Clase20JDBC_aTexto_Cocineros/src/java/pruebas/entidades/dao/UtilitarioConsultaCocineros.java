package pruebas.entidades.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UtilitarioConsultaCocineros {
    
        public static String devolucion() {
        String devuelvo = "";
        try {
            // Cargamos el driver de Mariadb o Mysql
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            devuelvo += "JDBC: Cargo el Driver OK";
            devuelvo += "\n";
            Connection conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/chefs",
                    "educacion",
                    "educacion");
            devuelvo += "JDBC: Conectando a la Base OK";
            devuelvo += "\n";

            PreparedStatement sentencia = conectar.prepareStatement(
                    " SELECT * FROM cocineros ");
            devuelvo += "JDBC: Cree la Sentencia OK";
            devuelvo += "\n";

            ResultSet resultado = sentencia.executeQuery();
            devuelvo += "JDBC: Ejecute la Sentencia "
                    + " en la Base de Datos OK";
            devuelvo += "\n";

            while (resultado.next()) {
                devuelvo += ""
                        + resultado.getString(1)
                        + ", "
                        + resultado.getString(2);
                devuelvo += "\n";
            }
            devuelvo += "JDBC: Resultados de la Base de datos OK";
            devuelvo += "\n";

            //} catch (ClassNotFoundException ex) {
        } catch (Exception ex) {
            devuelvo += "JDBC: ERROR " + ex.getMessage();
            devuelvo += "\n";
        }
        return devuelvo;
    }

}
