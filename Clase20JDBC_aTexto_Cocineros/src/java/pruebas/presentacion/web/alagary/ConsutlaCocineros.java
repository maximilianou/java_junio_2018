package pruebas.presentacion.web.alagary;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pruebas.entidades.dao.UtilitarioConsultaCocineros;

@WebServlet(name = "ConsutlaCocineros", urlPatterns = {"/ConsutlaCocineros"})
public class ConsutlaCocineros extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String unTexto = UtilitarioConsultaCocineros.devolucion();
         response.getWriter().print( unTexto );
    }

}
