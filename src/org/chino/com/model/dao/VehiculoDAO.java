package org.chino.com.model.dao;

import org.chino.com.model.entities.Vehiculo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VehiculoDAO extends DAO<Vehiculo, String> {
    public VehiculoDAO() {
        super("sp_saveVehiculo(?,?,?,?,?)", "sp_searchVehiculo(?)", "sp_readAllVehiculo()", "sp_updateVehiculo(?,?,?,?,?)", "sp_deleteVehiculo(?)");
    }

    @Override
    public Vehiculo resulsetToObject(ResultSet resultSet) throws SQLException {
        String placa = resultSet.getString(1);
        String marca = resultSet.getString(2);
        String color = resultSet.getString(3);
        String linea = resultSet.getString(4);
        int idTipoVehiculo = resultSet.getInt(5);

        return new Vehiculo(placa, marca, color, linea, idTipoVehiculo);
    }

    @Override
    public void setProcedureParams(PreparedStatement sp, Vehiculo vehiculo) throws SQLException {
        sp.setString(1, vehiculo.getMarca());
        sp.setString(2, vehiculo.getColor());
        sp.setString(3, vehiculo.getLinea());
        sp.setInt(4, vehiculo.get_tipoVehiculo());
        sp.setString(5, vehiculo.getPlaca());
    }

    @Override
    public void setIdParam(PreparedStatement sp, String id) throws SQLException {
        sp.setString(1, id);
    }
}
