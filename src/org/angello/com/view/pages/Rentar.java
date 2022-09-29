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
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Rent Page");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 705, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 581, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE)))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;

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
        Double costo = Double.valueOf(tuples.get(1));
        Date fechaInicio = Date.valueOf(tuples.get(2));
        Date fechaFinal = Date.valueOf(tuples.get(3));
        String placa = tuples.get(4);
        Long CUI = Long.valueOf(tuples.get(5));

        return new Renta(id, costo, fechaInicio, fechaFinal, placa, CUI);
    }

    @Override
    public Renta arrStringToModel(ArrayList<String> tuples, boolean isFormFormat) {
        if (!isFormFormat) return arrStringToModel(tuples);
        Renta renta = arrStringToModel(tuples);
        renta.setIdRenta(0);

        return renta;
    }
    // End of variables declaration//GEN-END:variables
}