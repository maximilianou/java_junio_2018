package entidades;

public class Categoria {
    private String nombre;

    @Override
    public String toString() {
        return "" + nombre; 
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
