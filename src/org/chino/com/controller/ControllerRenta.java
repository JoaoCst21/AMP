package org.chino.com.controller;

import org.chino.com.model.dao.RentasDAO;
import org.chino.com.model.entities.Renta;
import org.chino.com.view.pages.Rentar;

public class ControllerRenta extends Controller<Renta, Integer, RentasDAO, Rentar> {
    public ControllerRenta() {
        super(new RentasDAO(), Rentar.getInstance(), "Renta");
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
