package org.chino.com.controller;

import org.chino.com.model.dao.ClienteDAO;
import org.chino.com.model.entities.Cliente;
import org.chino.com.view.pages.Clientes;

public class ControllerCliente extends Controller<Cliente, Long, ClienteDAO, Clientes> {
    public ControllerCliente() {
        super(new ClienteDAO(), Clientes.getInstance(), "Clientes");
    }

    @Override
    protected void subscribe() {
        view.addHandlerTolistenToSelectedTable(this);
        view.addHandlerToSave(this);
    }

    @Override
    protected Long getPrimaryKey() {
        return Long.valueOf(String.valueOf(view.getTable().getValueAt(view.getTable().getSelectedRow(), 0)));
    }
}
