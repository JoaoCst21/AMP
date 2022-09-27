package org.angello.com.controller;

import org.angello.com.model.dao.DAO;
import org.angello.com.view.View;

import javax.swing.JOptionPane;

public abstract class Controller<Model, Dao extends DAO, PanelView extends View> {
    private final Dao dao;
    protected final PanelView view;
    private final String titleError;

    public Controller(Dao dao, PanelView view, String titleError) {
        this.dao = dao;
        this.view = view;
        this.titleError = titleError;
        try {
            view.setData(dao.readAll());
            System.out.println("Works?????");
        } catch (Exception e) {
            System.out.println("DONTWorks?????");
        }
        subscribe();
    }

    protected abstract void subscribe();

    public void controllerSaveData(Model model) {
        try {
            // save data into Model
            dao.save(model);
            // update PanelView extends View
            view.update(dao.readAll());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Crear " + titleError + " Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void controllerUpdateData(Model model) {
        try {
            // update data into Model
            dao.update(model);
            // update PanelView extends View
            view.update(dao.readAll());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Modificar " + titleError + " Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void controllerDeleteData(int id) {
        try {
            // save data into Model
            dao.delete(id);
            // update PanelView extends View
            view.update(dao.readAll());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Eliminar " + titleError + " Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
