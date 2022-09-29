package org.chino.com.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class DAO<Class, T> implements CRUD<Class, T> {
    // Attributes
    private String saveProcedure;
    private String readProcedure;
    private String readAllProcedure;
    private String updateProcedure;
    private String deleteProcedure;

    // Constructor
    public DAO(String saveProcedure, String readProcedure, String readAllProcedure, String updateProcedure, String deleteProcedure) {
        this.saveProcedure = saveProcedure;
        this.readProcedure = readProcedure;
        this.readAllProcedure = readAllProcedure;
        this.updateProcedure = updateProcedure;
        this.deleteProcedure = deleteProcedure;
    }

    protected PreparedStatement prepareCall(String procedure) throws SQLException {
        return Conexion.getInstance().getConnection().prepareCall("CALL " + procedure);
    }

    protected void printError(Exception e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
    }

    public abstract Class resulsetToObject(ResultSet resultSet) throws SQLException;

    public abstract void setProcedureParams(PreparedStatement sp, Class object) throws SQLException;

    public abstract void setIdParam(PreparedStatement sp, T id) throws SQLException;

    @Override
    public void save(Class object) throws Exception {
        try {
            PreparedStatement sp = prepareCall(saveProcedure);
            setProcedureParams(sp, object);
            sp.execute();
        } catch (SQLException e) {
            printError(e);
            throw new Exception("no se ha podido Guardar los Datos");
        }
    }

    @Override
    public Class search(T id) throws Exception {
        try {
            PreparedStatement sp = prepareCall(readProcedure);
            setIdParam(sp, id);
            ResultSet resultSet = sp.executeQuery();
            while (resultSet.next()) {
                return resulsetToObject(resultSet);
            }
        } catch (SQLException e) {
            printError(e);
            throw new Exception("no se ha podido Encontrar los Datos");
        }
        return null;
    }

    @Override
    public ArrayList<Class> readAll() throws Exception {

        try {
            ArrayList<Class> object = new ArrayList<>();
            PreparedStatement sp = prepareCall(readAllProcedure);
            ResultSet resultSet = sp.executeQuery();
            while (resultSet.next()) {
                object.add(resulsetToObject(resultSet));
            }
            return object;
        } catch (SQLException e) {
            printError(e);
            throw new Exception("Ha habido algún error en la base de Datos");
        }
    }

    @Override
    public void update(Class object) throws Exception {
        try {
            PreparedStatement sp = prepareCall(updateProcedure);
            setProcedureParams(sp, object);
            sp.execute();
        } catch (SQLException e) {
            printError(e);
            throw new Exception("no se ha podido Actualizar los datos");
        }
    }

    @Override
    public void delete(T id) throws Exception {
        try {
            PreparedStatement sp = prepareCall(deleteProcedure);
            setIdParam(sp, id);
            sp.execute();
        } catch (SQLException e) {
            printError(e);
            throw new Exception("no se ha podido Eliminar los datos");
        }
    }
}
