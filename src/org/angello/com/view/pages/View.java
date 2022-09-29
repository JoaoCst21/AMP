package org.angello.com.view.pages;

import org.angello.com.view.components.ModalWindow;
import org.angello.com.view.forms.Form;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

public abstract class View<Model, Controller extends org.angello.com.controller.Controller> extends JPanel {
    protected ModalWindow modalUploadForm;
    protected ModalWindow modalModifiedForm;
    protected final String[] column;
    protected JTable table = new JTable();
    protected JButton btnCreate = new JButton();
    protected ArrayList<Model> data;

    private String title;


    public ArrayList<Model> getData() {
        return data;
    }

    public void setData(ArrayList<Model> data) {
        this.data = data;
    }

    public View(String[] column, String title) {
        this.column = column;
        this.title = title;
    }


    public void myInitComponents() {
        setDataModel(data);
        revalidate();
        repaint();
    }


    public void update(ArrayList<Model> models, boolean persistClick) {
        if (!persistClick) {
            update(models);
            return;
        }
        int selected = getTable().getSelectedRow();
        update(models);
        getTable().setRowSelectionInterval(selected, selected);
        revalidate();
        repaint();
    }

    public void update(ArrayList<Model> models) {
        this.removeAll();
        render(models);
        revalidate();
        repaint();
    }

    public ModalWindow createForm() {
        Form form = new Form(getFormFieldsTitles(), getTitle());
        ModalWindow frame = new ModalWindow(form);
        frame.setSize(new Dimension(300, 300));

        return frame;
    }

    private void setDataModel(ArrayList<Model> models) {
        ArrayList<ArrayList<String>> tuples = modelArrToStringArr2D(models);
        // convert to array
        String[][] stringArray = tuples.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);
        // set Table data
        table.setModel(new DefaultTableModel(stringArray, column));
    }

    public void addHandlerTolistenToSelectedTable(Controller controller) {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String[] responses = new String[]{"Cancelar", "Modificar", "Eliminar"};
                String message = "Deseas Eliminar o Modificar este Elemento?";
                int option = JOptionPane.showOptionDialog(null, message, "Modificar Datos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, responses, 0);
                controller.controlTableClick(option);
            }
        });
    }

    public abstract ArrayList<String> getSelectedTuple();

    public void addHandlerToSave(Controller controller) {
        btnCreate.addActionListener(e -> {
            modalUploadForm = createForm();
            modalUploadForm.getForm().getButtonSubmit().addActionListener(ev -> {
                controller.controllerSaveData();
            });
            modalUploadForm.setVisible(true);
        });
    }

    protected abstract String[] getFormFieldsTitles();

    public abstract void render(ArrayList<Model> models);


    public abstract ArrayList<ArrayList<String>> modelArrToStringArr2D(ArrayList<Model> models);

    public abstract Model arrStringToModel(ArrayList<String> tuples);

    public abstract Model arrStringToModel(ArrayList<String> tuples, boolean isFormFormat);


    public ModalWindow getModalUploadForm() {
        return modalUploadForm;
    }

    public ModalWindow getModalModifiedForm() {
        return modalModifiedForm;
    }

    public String[] getColumn() {
        return column;
    }

    public JTable getTable() {
        return table;
    }

    public JButton getBtnCreate() {
        return btnCreate;
    }

    public String getTitle() {
        return title;
    }

    public void setModalUploadForm(ModalWindow modalUploadForm) {
        this.modalUploadForm = modalUploadForm;
    }

    public void setModalModifiedForm(ModalWindow modalModifiedForm) {
        this.modalModifiedForm = modalModifiedForm;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public void setBtnCreate(JButton btnCreate) {
        this.btnCreate = btnCreate;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
