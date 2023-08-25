package unidad1;

public class Usuario {
    private String nombre;
    private String id;
    private Integer edad;
    private String pais;

    public Usuario() {
    }

    public Usuario(String nombre, String id, Integer edad, String pais) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
