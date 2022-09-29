/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.angello.com.view.pages;

import org.angello.com.controller.ControllerRenta;
import org.angello.com.model.entities.Renta;

import java.sql.Date;
import java.util.ArrayList;

/**
 * @author Deran
 */
public class Rentar extends View<Renta, ControllerRenta> {

    private static Rentar instance;

    public static Rentar getInstance() {
        if (instance == null) instance = new Rentar();
        return instance;
    }

    /**
     * Creates new form Rentar
     */
    private Rentar() {
        super(new String[]{"ID", "Costo", "Fecha Inicio", "Fecha Final", "Placa", "CUI Rentador"}, "Renta");
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        //        btnCreate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        //        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnCreate.setBackground(new java.awt.Color(102, 153, 255));
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Agregar");

        jPanel2.setBackground(new java.awt.Color(78, 159, 61));
        jScrollPane1.setViewportView(table);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/angello/com/resources/carro1(2) (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(39, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(375, 375, 375))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(27, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    @Override
    public ArrayList<String> getSelectedTuple() {
        ArrayList<String> tuple = new ArrayList<>();
        for (int i = 0; i < column.length; i++) {
            if (i == 0) continue;
            tuple.add((String) table.getValueAt(table.getSelectedRow(), i));
        }
        return tuple;
    }

    @Override
    protected String[] getFormFieldsTitles() {
        ArrayList<String> titles = new ArrayList<>();
        for (int i = 0; i < getColumn().length; i++) {
            if (i == 0) continue;
            titles.add(getColumn()[i]);
        }
        return titles.toArray(new String[0]);
    }

    @Override
    public void render(ArrayList<Renta> rentas) {
        setData(rentas);
        initComponents();
        myInitComponents();
        revalidate();
        repaint();
    }

    @Override
    public ArrayList<ArrayList<String>> modelArrToStringArr2D(ArrayList<Renta> rentas) {
        ArrayList<ArrayList<String>> array = new ArrayList<>();

        for (Renta renta : rentas) {
            String id = String.valueOf(renta.getIdRenta());
            String costo = String.valueOf(renta.getCosto());
            String fechaInicio = String.valueOf(renta.getFechaInicio());
            String fechaFinal = String.valueOf(renta.getFechaFinal());
            String placa = String.valueOf(renta.get_vehiculoPlaca());
            String CUIRentador = String.valueOf(renta.get_clienteCUI());
            array.add(new ArrayList<String>() {{
                add(id);
                add(costo);
                add(fechaInicio);
                add(fechaFinal);
                add(placa);
                add(CUIRentador);
            }});
        }
        return array;
    }

    @Override
    public Renta arrStringToModel(ArrayList<String> tuples) {
        int id = Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
        Double costo = Double.valueOf(tuples.get(0));
        Date fechaInicio = Date.valueOf(tuples.get(1));
        Date fechaFinal = Date.valueOf(tuples.get(2));
        String placa = tuples.get(3);
        Long CUI = Long.valueOf(tuples.get(4));

        return new Renta(id, costo, fechaInicio, fechaFinal, placa, CUI);
    }

    @Override
    public Renta arrStringToModel(ArrayList<String> tuples, boolean isFormFormat) {
        if (!isFormFormat) return arrStringToModel(tuples);
        Double costo = Double.valueOf(tuples.get(0));
        Date fechaInicio = Date.valueOf(tuples.get(1));
        Date fechaFinal = Date.valueOf(tuples.get(2));
        String placa = tuples.get(3);
        Long CUI = Long.valueOf(tuples.get(4));

        return new Renta(0, costo, fechaInicio, fechaFinal, placa, CUI);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    //    javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    //    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
