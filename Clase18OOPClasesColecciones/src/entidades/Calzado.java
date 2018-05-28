package entidades;

public class Calzado {

    // atributo precio, que todas las zapatillas tienen
    // adjetivos, propiedades, caracteriastidcas, vartiables
    private double precio;
    private String color;
    private int talle;

    // metodos de la clase Zapatilla
    // acciones, verbos, procedimientos, funciones, macros, ruinas
    
    @Override
    public String toString() {
        return "" + precio + ", " + talle + ", " + color; 
    }
    


    
    public double getPrecio() {
        
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getTalle() {
        return talle;
    }
    public void setTalle(int talle) {
        this.talle = talle;
    }
    
}
