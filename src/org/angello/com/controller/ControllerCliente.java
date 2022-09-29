package org.angello.com.controller;

import org.angello.com.model.dao.ClienteDAO;
import org.angello.com.model.entities.Cliente;
import org.angello.com.view.pages.Clientes;

public class ControllerCliente extends Controller<Cliente, Long, ClienteDAO, Clientes> {
    public ControllerCliente(ClienteDAO dao, Clientes view, String titleError) {
        super(dao, view, titleError);
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
