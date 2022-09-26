package org.angello.com.model.entities;

public class Cliente {
    // Attributes
    private Long CUI;
    private String nombre;
    private String apellido;
    private int telefono;
    private String email;

    // Constructor
    public Cliente(Long CUI, String nombre, String apellido, int telefono, String email) {
        this.CUI = CUI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters
    public Long getCUI() {
        return CUI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setCUI(Long CUI) {
        this.CUI = CUI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
