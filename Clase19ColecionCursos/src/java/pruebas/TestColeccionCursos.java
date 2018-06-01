package pruebas;

import entidades.Categoria;
import entidades.Curso;
import java.util.ArrayList;

public class TestColeccionCursos {

    public static void main(String[] args) {
        System.out.println("[..] Coleccion de Cursos");

        Categoria idioma = new Categoria();
        Categoria informatica = new Categoria();
        Categoria electro = new Categoria();

        Curso ingles = new Curso();
        Curso ingles1 = new Curso();
        Curso electricidad = new Curso();
        Curso programacion = new Curso();
        Curso programacion2 = new Curso();

        idioma.setNombre("Idiomas");
        informatica.setNombre("Informatica");
        electro.setNombre("Electicidad");
        
        ingles.setNombre("Ingles Inicial");
        ingles.setCategoria(idioma);
        
        ingles1.setNombre("Ingles Intermedio");
        ingles1.setCategoria(idioma);
        
        System.out.println("" + ingles);        
        System.out.println("" + ingles1);        
        System.out.println("1. -------------------- ");
        
        programacion.setNombre("Java Inicial");
        programacion.setCategoria(informatica);

        programacion2.setNombre("Java Avanzado");
        programacion2.setCategoria(informatica);
        System.out.println("" + programacion);
        System.out.println("" + programacion2);
       
        System.out.println("2. -------------------- ");

        ArrayList<Curso> lista = new ArrayList();
        lista.add(ingles);
        lista.add(programacion2);
        lista.add(ingles1);
        lista.add(programacion);
        System.out.println("" + lista);        
        
        System.out.println("3. -------------------- ");
        // una forma de recorrer la lista, o ir elemento por elemento
//        for( int i = 0; i <= lista.size() ; i++ ){
        for( int i = 0; i < lista.size() ; i++ ){
            System.out.println("" + i + ":" + lista.get(i) );
        }
        
        System.out.println("4. -------------------- ");
        // for each, para cada
        for( Curso cursoActual : lista ){
            System.out.println("" + cursoActual);
        }        
        System.out.println("5. -------------------- ");
        for( Curso cursoActual : lista ){
            
            if( cursoActual.getCategoria().equals(idioma) ){
              System.out.println("Trainnig:     " + cursoActual);
            }else{
              System.out.println("Capacitacion: " + cursoActual);
            }
            
        }        
        
        System.out.println("6. -------------------- ");
        System.out.println("7. -------------------- ");
        System.out.println("8. -------------------- ");
        
        System.out.println("[OK] Coleccion de Cursos");
    }

}





