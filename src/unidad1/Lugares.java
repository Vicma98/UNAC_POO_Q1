package unidad1;

public class Lugares {
    private String ubicacion;
    private String horarioAtencion;
    private String nombre;
    private String precio;

    public Lugares() {
    }
// metodo constructor
    public Lugares(String ubicacion, String horarioAtencion, String nombre, String precio) {
        this.ubicacion = ubicacion;
        this.horarioAtencion = horarioAtencion;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio =precio;
    }

    @Override
    public String toString() {
        return
                " ubicacion=" + ubicacion + '\'' +
                " horarioAtencion =" + horarioAtencion +
                " nombre= ' " + nombre + '\'' +
                " precio=" + precio + "\n";
    }
}
