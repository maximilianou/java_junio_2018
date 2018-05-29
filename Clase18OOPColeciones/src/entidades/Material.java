package entidades;

// la clase
public class Material  implements Comparable<Material> {
    // los atributos
    private double precio;
    private String nombre;

    // los metodos
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "" + nombre + " : " + precio; 
    }

    @Override
    public int compareTo(Material t) {
        return this.nombre.compareTo( t.getNombre() );
    }
    
           
}
