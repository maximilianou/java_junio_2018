package pruebas.auto;

public class TestAutoUno implements TestMain {
    public static void main(String[] args) {
        System.out.println("[..] Test Auto UNO !!! ");
        
        System.out.println("[OK] Test Auto UNO !!! ");
    }

    
    
    @Override
    public void testear(String[] args) {
       TestAutoUno.main(args);
    }
    
    
}




