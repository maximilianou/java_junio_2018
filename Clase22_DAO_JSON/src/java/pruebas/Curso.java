package pruebas;

class Curso {

    private int id;
    private String nombre;
    private int cantidadClases;

    @Override
    public String toString() {
        
        return  "_" + id + "_" + nombre + "_" + cantidadClases + "_"; 
    }


    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidadClases() {
        return cantidadClases;
    }
    public void setCantidadClases(int cantidadClases) {
        this.cantidadClases = cantidadClases;
    }
    
}
