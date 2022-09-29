package org.chino.com.model.entities;

public class Vehiculo {
    // Attributes
    private String placa;
    private String marca;
    private String color;
    private String linea;
    private int _tipoVehiculo;

    public Vehiculo(String placa, String marca, String color, String linea, int _tipoVehiculo) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.linea = linea;
        this._tipoVehiculo = _tipoVehiculo;
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getLinea() {
        return linea;
    }

    public int get_tipoVehiculo() {
        return _tipoVehiculo;
    }

    // Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void set_tipoVehiculo(int _tipoVehiculo) {
        this._tipoVehiculo = _tipoVehiculo;
    }
}
