package entidades;

import java.util.Date;

public class Recordatorio {
    private String nombre;
    private Date fecha;

    //@Override
    public String toString() {
        return "" + nombre + " : " + fecha; 
    }


    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
