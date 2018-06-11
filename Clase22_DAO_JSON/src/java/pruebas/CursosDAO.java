package pruebas;

import java.util.*;

class CursosDAO {

    static ArrayList<Curso> consultar() {
        
        ArrayList<Curso> lista = new ArrayList();
        
        // aca voy a consultar la base de ddatos 
        // y luego alimentare el array list lista con los datos
        // que vienen de la base de datos, y punto, el SQL vive aqui
        
        Curso unCursoCargadoAMano = new Curso();
        // inventando un curso para que me devuelva algo el DAO
        // antes de ponerme a aprogramar la base de datos
        unCursoCargadoAMano.setId(544);
        unCursoCargadoAMano.setNombre("Java I");
        unCursoCargadoAMano.setCantidadClases(38);
        lista.add( unCursoCargadoAMano );
        
        unCursoCargadoAMano.setId(544);
        unCursoCargadoAMano.setNombre("Java I");
        unCursoCargadoAMano.setCantidadClases(38);
        lista.add( unCursoCargadoAMano );
        
        return lista;
    }
    
}
