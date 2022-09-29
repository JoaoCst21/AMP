package org.angello.com.model.dao;

import org.angello.com.model.entities.TipoVehiculo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TipoVehiculoDAO extends DAO<TipoVehiculo, Integer> {
    public TipoVehiculoDAO() {
        super("sp_saveTipoVehiculo(?)", "sp_searchTipoVehiculo(?)", "sp_readAllTipoVehiculo()", "sp_updateTipoVehiculo(?,?)", "sp_deleteTipoVehiculo(?)");
    }

    @Override
    public TipoVehiculo resulsetToObject(ResultSet resultSet) throws SQLException {
        int idTipoVehiculo = resultSet.getInt(1);
        String nombreTipoVehiculo = resultSet.getString(2);

        return new TipoVehiculo(idTipoVehiculo, nombreTipoVehiculo);
    }

    @Override
    public void setProcedureParams(PreparedStatement sp, TipoVehiculo tipoVehiculo) throws SQLException {
        sp.setString(1, tipoVehiculo.getNombreTipoVehiculo());
        if (tipoVehiculo.getIdTipoVehiculo() == 0) return;
        sp.setInt(2, tipoVehiculo.getIdTipoVehiculo());
    }

    @Override
    public void setIdParam(PreparedStatement sp, Integer id) throws SQLException {
        sp.setInt(1, id);
    }
}
