package org.angello.com.model.entities;

public class TipoVehiculo {
    // Attributes
    private int idTipoVehiculo;
    private String nombreTipoVehiculo;

    public TipoVehiculo(int idTipoVehiculo, String nombreTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
        this.nombreTipoVehiculo = nombreTipoVehiculo;
    }

    // Getters
    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public String getNombreTipoVehiculo() {
        return nombreTipoVehiculo;
    }

    // Setters
    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public void setNombreTipoVehiculo(String nombreTipoVehiculo) {
        this.nombreTipoVehiculo = nombreTipoVehiculo;
    }
}
