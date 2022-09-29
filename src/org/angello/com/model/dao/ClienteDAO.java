package org.angello.com.model.dao;

import org.angello.com.model.entities.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO extends DAO<Cliente, Long> {
    public ClienteDAO() {
        super("sp_saveCliente(?,?,?,?,?)", "sp_searchCliente(?)", "sp_readAllCliente()", "sp_updateCliente(?,?,?,?,?)", "sp_deleteCliente(?)");
    }

    @Override
    public Cliente resulsetToObject(ResultSet resultSet) throws SQLException {
        Long CUI = resultSet.getLong(1);
        String nombre = resultSet.getString(2);
        String apellido = resultSet.getString(3);
        int telefono = resultSet.getInt(4);
        String email = resultSet.getString(5);

        return new Cliente(CUI, nombre, apellido, telefono, email);
    }

    @Override
    public void setProcedureParams(PreparedStatement sp, Cliente cliente) throws SQLException {
        sp.setString(1, cliente.getNombre());
        sp.setString(2, cliente.getApellido());
        sp.setInt(3, cliente.getTelefono());
        sp.setString(4, cliente.getEmail());
        sp.setLong(5, cliente.getCUI());
    }

    @Override
    public void setIdParam(PreparedStatement sp, Long id) throws SQLException {
        sp.setLong(1, id);
    }
}
