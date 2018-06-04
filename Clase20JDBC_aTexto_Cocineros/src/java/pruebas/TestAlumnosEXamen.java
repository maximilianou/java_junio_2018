package pruebas;

import pruebas.auto.TestMain;

public class TestAlumnosEXamen {
    public static void main(String[] args) {
        try {
            System.out.println("[..] Checkeando Alunos Aorpoas");
            
            TestMain uno = (TestMain)Class.forName("pruebas.auto.TestAutoUno").newInstance();
            TestMain dos = (TestMain)Class.forName("pruebas.auto.TestAutoDos").newInstance();
            
            uno.testear(args);
            dos.testear(args);
            
            System.out.println("[OK] Checkeando Alunos Aorpoas");
        } catch (ClassNotFoundException ex) {
System.out.println("[ERRROr] Clase no encontrada " + ex.getMessage());
        } catch (InstantiationException ex) {
System.out.println("[ERRROr] No se Instancia " + ex.getMessage());
        } catch (IllegalAccessException ex) {
System.out.println("[ERRROr] acceso ilegal " + ex.getMessage());
        }
    }
}
