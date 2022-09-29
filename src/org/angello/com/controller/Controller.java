package org.angello.com.controller;

import org.angello.com.model.dao.DAO;
import org.angello.com.view.components.ModalWindow;
import org.angello.com.view.pages.View;

import javax.swing.JOptionPane;

public abstract class Controller<Model, T, Dao extends DAO<Model, T>, PanelView extends View<Model, ?>> {
    private final Dao dao;
    protected final PanelView view;
    private final String titleError;

    public Controller(Dao dao, PanelView view, String titleError) {
        this.dao = dao;
        this.view = view;
        this.titleError = titleError;
        subscribe();
    }

    protected abstract void subscribe();

    protected abstract T getPrimaryKey();

    public void controlTableClick(int option) {
        try {
            if (option == 0) return;
            if (option == 1) {
                // create and Assign Form
                view.setModalModifiedForm(view.createForm());
                // set EventListener
                view.getModalModifiedForm().getForm().getButtonSubmit().addActionListener(e -> {
                    controllerUpdateData();
                });
                // set Form Data
                view.getModalModifiedForm().getForm().setFormData(view.getSelectedTuple());
                // show Form
                view.getModalModifiedForm().setVisible(true);
                return;
            }
            if (option == 2) {
                // Show Form
                // get Data Form
                // Update Model
                String message = "Estas seguro que deseas Eliminar esta tupla?, esta accion no se puede deshacer";
                String[] responses = {"SI", "NO"};
                int subOption = JOptionPane.showOptionDialog(null, message, "Seguro?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, responses, 0);
                if (subOption != 0) return;
                controllerDeleteData();
            }
            return;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Crear " + titleError + " Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void controllerSaveData() {
        try {
            ModalWindow modalWindow = view.getModalUploadForm();
            modalWindow.getForm().validateFields();
            System.out.println(modalWindow.getForm().getFormData());
            Model model = view.arrStringToModel(modalWindow.getForm().getFormData(), true);
            // save data into Model
            dao.save(model);
            // update PanelView extends View
            view.update(dao.readAll(), false);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Crear " + titleError + " Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void controllerUpdateData() {
        try {
            ModalWindow modalWindow = view.getModalModifiedForm();
            modalWindow.getForm().validateFields();
            System.out.println(modalWindow.getForm().getFormData());
            Model model = view.arrStringToModel(modalWindow.getForm().getFormData(), false);
            // update data into Model
            dao.update(model);
            // update PanelView extends View
            view.update(dao.readAll(), true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Modificar " + titleError + " Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void controllerDeleteData() {
        try {
            //// DEBUG
            // save data into Model
            dao.delete(getPrimaryKey());
            // update PanelView extends View
            view.update(dao.readAll(), false);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Eliminar " + titleError + " Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void initView() {
        try {
            view.render(dao.readAll());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Something Really Bad Happen", JOptionPane.ERROR_MESSAGE);
        }
    }
}
