package pruebas;

import entidades.Recordatorio;
import java.util.ArrayList;
import java.util.Date;

public class TestRecordatorio {
    public static void main(String[] args) {
        System.out.println("[..] Recordatoriosssss");
        
        Recordatorio cambioAceite = new Recordatorio();
        cambioAceite.setNombre("Primer Cambio Aceite");
        cambioAceite.setFecha( new Date() );
        System.out.println("" + cambioAceite );

        Recordatorio cambioPastillas = new Recordatorio();
        cambioPastillas.setNombre("Las Pastillas del abuelo!!!");
        cambioPastillas.setFecha(  new Date() );
        System.out.println("" + cambioPastillas );

        ArrayList<Recordatorio> lista = new ArrayList();
        lista.add(cambioAceite);
        lista.add(cambioPastillas);
        lista.add(cambioAceite);
        lista.add(cambioPastillas);
        
        System.out.println("1. ------------------------- ");
        
        System.out.println("" + lista);
        
        System.out.println("2. ------------------------- ");
        
        for(int i = 0; i < lista.size(); i++  ){
            System.out.println("" + i + " : " + lista.get(i) );
        }
        
        System.out.println("3. ------------------------- ");
        
        for( Recordatorio recActual : lista ){
            
            if( recActual.getNombre().startsWith("Pri") ){
                System.out.println("Descuento 20%: " + recActual);
            }else{
                System.out.println("Lo que Sale  : " + recActual);
            }
            
        }
        
        System.out.println("4. ------------------------- ");
        
        System.out.println("[OK] Recordatoriosssss");
    }
}






