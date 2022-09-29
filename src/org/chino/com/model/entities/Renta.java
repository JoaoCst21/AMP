package org.chino.com.model.entities;

import java.sql.Date;

public class Renta {
    // Attributes
    private int idRenta;
    private Double costo;
    private Date fechaInicio;
    private Date fechaFinal;
    private String _vehiculoPlaca;
    private Long _clienteCUI;

    // Constructor
    public Renta(int idRenta, Double costo, Date fechaInicio, Date fechaFinal, String _vehiculoPlaca, Long _clienteCUI) {
        this.idRenta = idRenta;
        this.costo = costo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this._vehiculoPlaca = _vehiculoPlaca;
        this._clienteCUI = _clienteCUI;
    }

    // Getters
    public int getIdRenta() {
        return idRenta;
    }

    public Double getCosto() {
        return costo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public String get_vehiculoPlaca() {
        return _vehiculoPlaca;
    }

    public Long get_clienteCUI() {
        return _clienteCUI;
    }

    // Setters
    public void setIdRenta(int idRenta) {
        this.idRenta = idRenta;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void set_vehiculoPlaca(String _vehiculoPlaca) {
        this._vehiculoPlaca = _vehiculoPlaca;
    }

    public void set_clienteCUI(Long _clienteCUI) {
        this._clienteCUI = _clienteCUI;
    }
}
