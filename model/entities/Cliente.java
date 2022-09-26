package org.angello.com.model.entities;

public class Cliente {
    // Attributes
    private int CUI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    // Constructor
    public Cliente(int CUI, String nombre, String apellido, String telefono, String email) {
        this.CUI = CUI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters
    public int getCUI() {
        return CUI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setCUI(int CUI) {
        this.CUI = CUI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
