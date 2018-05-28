package pruebas;

import entidades.Zapato;
import entidades.Zapatilla;
import entidades.Calzado;

public class TestListaZapatillas {
    
    public static void main(String[] args) {
        System.out.println("[..] test listar zapatillas");

        // crear una lista de zapatillas
        // la zapatilla
        //    precio
        //    talle
        //    color
        // quiero crear 5 zapatillas
        // quiero poder imprimir la lista
        // Lista de Zapatillas
        // Quiero que no se infiltre un Calzetin
        int cantidad = 10;
        Zapatilla adidas = new Zapatilla();
        adidas.setPrecio(2000.50);
        adidas.setColor("Negro");
        adidas.setTalle(44);
        
        Zapatilla nike = new Zapatilla();
        nike.setPrecio(4000);
        nike.setColor("Blanco");
        nike.setTalle(55);
        
        Zapatilla puma = new Zapatilla();
        puma.setPrecio(300);
        puma.setColor("Rojo");
        puma.setTalle(35);
        
        Zapatilla reebok = new Zapatilla();
        reebok.setPrecio(2500);
        reebok.setColor("Blanca y Azul");
        reebok.setTalle(38);
        
        Zapatilla converse = new Zapatilla();
        converse.setPrecio(1000);
        converse.setColor("Marron");
        converse.setTalle(42);
        
        System.out.println("A: " + adidas);
        System.out.println("B: " + nike);
        System.out.println("C: " + puma);
        System.out.println("D: " + reebok);
        System.out.println("E: " + converse);
        System.out.println("1. clases Zapatilla DONE ------ ");

//        Zapato nautico = new Zapato();
        Calzado nautico = new Zapato();
        nautico.setPrecio(1500);
        nautico.setTalle(43);
        nautico.setColor("Beidge");
        System.out.println("" + nautico);
        
        Calzado mocazin = new Zapato();
        mocazin.setPrecio(4500);
        mocazin.setColor("Marron");
        mocazin.setTalle(38);
        System.out.println("" + mocazin);
        
        System.out.println("2. Herencia, jerarquia, Reutilizar------ ");
        
        System.out.println("[OK] test listar zapatillas");
    }
    
}
