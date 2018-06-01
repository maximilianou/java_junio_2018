package entidades;

public class Curso {
    private String nombre;
    private Categoria categoria;

    @Override
    public String toString() {
        return "" + nombre + " : " + categoria; 
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
