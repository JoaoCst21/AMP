package org.angello.com.controller;

import org.angello.com.model.dao.VehiculoDAO;
import org.angello.com.model.entities.Vehiculo;
import org.angello.com.view.pages.VehiculosRentados;

public class ControllerVehiculo extends Controller<Vehiculo, String, VehiculoDAO, VehiculosRentados> {
    public ControllerVehiculo() {
        super(new VehiculoDAO(), VehiculosRentados.getInstance(), "Vehiculo");
    }

    @Override
    protected void subscribe() {
        view.addHandlerTolistenToSelectedTable(this);
        view.addHandlerToSave(this);
    }

    @Override
    protected String getPrimaryKey() {
        return String.valueOf(view.getTable().getValueAt(view.getTable().getSelectedRow(), 0));
    }
}
