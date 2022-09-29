package org.chino.com.controller;

import org.chino.com.model.dao.TipoVehiculoDAO;
import org.chino.com.model.entities.TipoVehiculo;
import org.chino.com.view.pages.Crear;

public class ControllerTipoVehiculos extends Controller<TipoVehiculo, Integer, TipoVehiculoDAO, Crear> {

    public ControllerTipoVehiculos() {
        super(new TipoVehiculoDAO(), Crear.getInstance(), "Tipo Vehiculo");
    }

    @Override
    protected void subscribe() {
        view.addHandlerTolistenToSelectedTable(this);
        view.addHandlerToSave(this);
    }

    @Override
    protected Integer getPrimaryKey() {
        return Integer.parseInt(String.valueOf(view.getTable().getValueAt(view.getTable().getSelectedRow(), 0)));
    }
}
