package pruebas;

import entidades.Material;
import entidades.MaterialPorKilo;
import entidades.MaterialPorUnidad;
import java.util.ArrayList;
import java.util.TreeSet;

public class TestPresupuesto {

    public static void main(String[] args) {
        System.out.println("[..] Collectando");
        
        System.out.println("1. -----------");
        Material clavos  = new MaterialPorKilo();
        clavos.setNombre("Clavos cabeza de Plomo");
        clavos.setPrecio(120);
        
        Material cemento = new MaterialPorKilo();
        cemento.setNombre("Hidra Contanct ");
        cemento.setPrecio(800);
        
        Material electrodos = new MaterialPorUnidad();
        electrodos.setNombre("Electrodos Shink");
        electrodos.setPrecio(55);
        
        Material tinglado = new MaterialPorUnidad();
        tinglado.setNombre("Tinglado con Varilla");
        tinglado.setPrecio(300);
               
        System.out.println("" + clavos);
        System.out.println("" + cemento);
        System.out.println("" + electrodos);
        System.out.println("" + tinglado);
        
        System.out.println("2. -----------");

//        ArrayList<Material> listado = new ArrayList();
        TreeSet<Material> listado = new TreeSet();
//        listado = 24;
        
        System.out.println("lista: " + listado.size());
        System.out.println("lista: " + listado);
        
        listado.add(clavos);
        
        System.out.println("lista: " + listado.size());
        System.out.println("lista: " + listado);

        listado.add(tinglado);
        listado.add(cemento);
        listado.add(clavos);
        listado.add(electrodos);
        listado.add(tinglado);
        
        System.out.println("lista: " + listado.size());
        System.out.println("lista: " + listado);

//        listado.add("Caballito Blanco de San Martin");
//        
//        System.out.println("lista: " + listado.size());
//        System.out.println("lista: " + listado);
        
        System.out.println("3. -----------");
        
        for( Material elementoActual : listado ){
            System.out.println("" + elementoActual);
        }
        
        System.out.println("4. -----------");
        
        System.out.println("5. -----------");
        
        System.out.println("[OK] Collectando");
    }
    
}
