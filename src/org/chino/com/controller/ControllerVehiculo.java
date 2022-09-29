package org.chino.com.controller;

import org.chino.com.model.dao.VehiculoDAO;
import org.chino.com.model.entities.Vehiculo;
import org.chino.com.view.pages.VehiculosRentados;

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
