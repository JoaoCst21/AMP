package org.angello.com.controller;

import org.angello.com.model.dao.VehiculoDAO;
import org.angello.com.model.entities.Vehiculo;
import org.angello.com.view.pages.VehiculosRentados;

public class ControllerVehiculo extends Controller<Vehiculo, VehiculoDAO, VehiculosRentados> {
    public ControllerVehiculo(VehiculoDAO dao, VehiculosRentados view, String titleError) {
        super(dao, view, titleError);
    }

    @Override
    protected void subscribe() {
        view.addHandlerTolistenToSelectedTable(this);
        view.addHandlerToSave(this);
    }
}
