package models;

public class Rol {
    private int id;         // ID único del rol
    private String nombre;  // Nombre del rol (e.g., "admin", "cocinero", "cliente")

    // Constructor vacío
    public Rol() {
    }

    // Constructor con parámetros
    public Rol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y Setters
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

    @Override
    public String toString() {
        return "Rol{id=" + id + ", nombre='" + nombre + '\'' + '}';
    }
}