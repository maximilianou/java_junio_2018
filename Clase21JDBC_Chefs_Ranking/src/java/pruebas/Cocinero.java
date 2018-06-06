package pruebas;

public class Cocinero {
    private String id;
    private String nombre;

    @Override
    public String toString() {
        return "(" + id + ")" + nombre; 
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
