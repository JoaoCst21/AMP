package org.angello.com.view;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public abstract class View<Model, Controller extends org.angello.com.controller.Controller> extends JPanel {
    protected final String[] column;
    protected JTable table = new JTable();
    protected JButton btnCreate = new JButton();
    protected ArrayList<Model> data;

    public ArrayList<Model> getData() {
        return data;
    }

    public void setData(ArrayList<Model> data) {
        this.data = data;
    }

    public View(String[] column) {
        this.column = column;
    }

    public void render(ArrayList<Model> models) {
        setData(models);
        initComponents();
    }

    protected abstract void initComponents();

    public void update(ArrayList<Model> models) {
        this.removeAll();
        this.initComponents();
        // map Model To Table Values
        ArrayList<ArrayList<String>> tuples = modelArrToStringArr2D(models);
        // convert to array
        String[][] stringArray = tuples.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);
        // set Table data
        table.setModel(new DefaultTableModel(stringArray, column));
        // new Table(Columns, tuples)
        revalidate();
        repaint();
    }

    public void addHandlerTolistenToSelectedTable(Controller controller) {
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // print JOptionPane asking if delete or update
                JOptionPane.showMessageDialog(null, "SIUUUUUU", "xd", JOptionPane.INFORMATION_MESSAGE);
                int option = 0;
                if (option == 0) return;
                if (option == 1) {
                    controller.controllerUpdateData(getSelectedTuple());
                }
                if (option == 2) {
                    controller.controllerSaveData(table.getValueAt(table.getSelectedRow(), 0));
                }
            }
        });
    }

    public Model getSelectedTuple() {
        ArrayList<String> tuple = new ArrayList<>();
        for (int i = 0; i < column.length; i++)
            tuple.add((String) table.getValueAt(table.getSelectedRow(), i));

        return arrStringToModel(tuple);
    }

    public void addHandlerToSave(Controller controller) {
        btnCreate.addActionListener(e -> {
            Model model = arrStringToModel(getFormData());
            controller.controllerSaveData(model);
        });
    }


    public abstract ArrayList<ArrayList<String>> modelArrToStringArr2D(ArrayList<Model> models);

    public abstract Model arrStringToModel(ArrayList<String> tuples);

    public abstract ArrayList<String> getFormData();
}
