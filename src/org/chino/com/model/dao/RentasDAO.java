package org.chino.com.model.dao;

import org.chino.com.model.entities.Renta;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RentasDAO extends DAO<Renta, Integer> {
    public RentasDAO() {
        super("sp_saveRenta(?,?,?,?,?)", "sp_searchRenta(?)", "sp_readAllRenta()", "sp_updateRenta(?,?,?,?,?,?)", "sp_deleteRenta(?)");
    }

    @Override
    public Renta resulsetToObject(ResultSet resultSet) throws SQLException {
        int idRenta = resultSet.getInt(1);
        Double costo = resultSet.getDouble(2);
        Date fechaInicio = resultSet.getDate(3);
        Date fechaFinal = resultSet.getDate(4);
        String _vehiculoPlaca = resultSet.getString(5);
        Long _clienteCUI = resultSet.getLong(6);

        return new Renta(idRenta, costo, fechaInicio, fechaFinal, _vehiculoPlaca, _clienteCUI);
    }

    @Override
    public void setProcedureParams(PreparedStatement sp, Renta renta) throws SQLException {
        sp.setDouble(1, renta.getCosto());
        sp.setDate(2, renta.getFechaInicio());
        sp.setDate(3, renta.getFechaFinal());
        sp.setString(4, renta.get_vehiculoPlaca());
        sp.setLong(5, renta.get_clienteCUI());
        if (renta.getIdRenta() == 0) return;
        sp.setInt(6, renta.getIdRenta());
    }

    @Override
    public void setIdParam(PreparedStatement sp, Integer id) throws SQLException {
        sp.setInt(1, id);
    }
}
