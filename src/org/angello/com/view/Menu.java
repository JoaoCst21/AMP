/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.angello.com.view;

import org.angello.com.view.pages.Clientes;
import org.angello.com.view.pages.Crear;
import org.angello.com.view.pages.Rentar;
import org.angello.com.view.pages.Usuarios;
import org.angello.com.view.pages.VehiculosRentados;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 * @author Deran
 */
public class Menu extends javax.swing.JFrame {
    Principal principal = new Principal();
    Crear crear = Crear.getInstance();
    Rentar rentar = Rentar.getInstance();
    VehiculosRentados rentados = new VehiculosRentados();
    Clientes clientes = new Clientes();
    Usuarios usuarios = new Usuarios();

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);

        // Adding panels to the main panel
        addPanel(principal);

        // Changing background colors
        selectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_rentar);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_clientes);
        deselectedButton(btn_usuarios);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_prin = new javax.swing.JPanel();
        home_icon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_crear = new javax.swing.JPanel();
        create_icon = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn_rentar = new javax.swing.JPanel();
        rent_icon = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_vehiculos = new javax.swing.JPanel();
        rents_icon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JPanel();
        clients_icon = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_usuarios = new javax.swing.JPanel();
        users_icon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(25, 26, 25));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido + user");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 32, -1, 30));

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Hoy es Lunes 26 de Septiembre de 2022");
        Header.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 68, -1, 30));

        jLabel15.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/org/angello/com/resources/carro1(2) (1).png"))); // NOI18N
        Header.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 850, 140));

        Menu.setBackground(new java.awt.Color(30, 81, 40));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/angello/com/resources/asdasd (1).png"))); // NOI18N
        Menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btn_prin.setBackground(new java.awt.Color(78, 159, 61));
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_prin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_prinMouseClicked(evt);
            }
        });
        btn_prin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_icon.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/org/angello/com/resources/home-outline.png"))); // NOI18N
        btn_prin.add(home_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Principal");
        btn_prin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_prin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 270, 50));

        btn_crear.setBackground(new java.awt.Color(30, 81, 40));
        btn_crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crear.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearMouseClicked(evt);
            }
        });
        btn_crear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_icon
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/angello/com/resources/carro2W2.png"))); // NOI18N
        btn_crear.add(create_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tipo vehículo");
        btn_crear.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        btn_rentar.setBackground(new java.awt.Color(30, 81, 40));
        btn_rentar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_rentar.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_rentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rentarMouseClicked(evt);
            }
        });
        btn_rentar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rent_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rent_icon.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/org/angello/com/resources/carro1(2) (1) (1).png"))); // NOI18N
        btn_rentar.add(rent_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Rentar");
        btn_rentar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_rentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        btn_vehiculos.setBackground(new java.awt.Color(30, 81, 40));
        btn_vehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_vehiculos.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_vehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_vehiculosMouseClicked(evt);
            }
        });
        btn_vehiculos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rents_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rents_icon.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/org/angello/com/resources/file-chart.png"))); // NOI18N
        btn_vehiculos.add(rents_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vehículos");
        btn_vehiculos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_vehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        btn_clientes.setBackground(new java.awt.Color(30, 81, 40));
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clientes.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientesMouseClicked(evt);
            }
        });
        btn_clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clients_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clients_icon.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/org/angello/com/resources/account-multiple.png"))); // NOI18N
        btn_clientes.add(clients_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Clientes");
        btn_clientes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        btn_usuarios.setBackground(new java.awt.Color(30, 81, 40));
        btn_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_usuarios.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseClicked(evt);
            }
        });
        btn_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users_icon.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/org/angello/com/resources/miniUserIconModify.png"))); // NOI18N
        btn_usuarios.add(users_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuarios");
        btn_usuarios.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 780));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 850, Short.MAX_VALUE));
        contentLayout.setVerticalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 620, Short.MAX_VALUE));

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 850, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPanel(JPanel panel) {
        // Panel configuration
        panel.setSize(850, 620);
        panel.setLocation(0, 0);

        // Adding panel to other Panel
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.repaint();
        content.revalidate();
    }

    private void selectedButton(JPanel panel) {
        Color selectedColor = new Color(78, 159, 61);
        panel.setBackground(selectedColor);
    }

    private void deselectedButton(JPanel panel) {
        Color deselectedColor = new Color(30, 81, 40);
        panel.setBackground(deselectedColor);
    }

    private void btn_prinMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_prinMouseClicked
        // TODO add your handling code here:
        addPanel(principal);

        // Changing background colors
        selectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_rentar);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_clientes);
        deselectedButton(btn_usuarios);
    }// GEN-LAST:event_btn_prinMouseClicked

    private void btn_crearMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_crearMouseClicked
        // TODO add your handling code here:
        addPanel(crear);

        // Changing background colors
        selectedButton(btn_crear);
        deselectedButton(btn_prin);
        deselectedButton(btn_rentar);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_clientes);
        deselectedButton(btn_usuarios);
    }// GEN-LAST:event_btn_crearMouseClicked

    private void btn_rentarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_rentarMouseClicked
        // TODO add your handling code here:
        addPanel(rentar);

        // Changing background colors
        selectedButton(btn_rentar);
        deselectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_clientes);
        deselectedButton(btn_usuarios);
    }// GEN-LAST:event_btn_rentarMouseClicked

    private void btn_vehiculosMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_vehiculosMouseClicked
        // TODO add your handling code here:
        addPanel(rentados);

        // Changing background colors
        selectedButton(btn_vehiculos);
        deselectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_rentar);
        deselectedButton(btn_clientes);
        deselectedButton(btn_usuarios);
    }// GEN-LAST:event_btn_vehiculosMouseClicked

    private void btn_clientesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_clientesMouseClicked
        // TODO add your handling code here:
        addPanel(clientes);

        // Changing background colors
        selectedButton(btn_clientes);
        deselectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_rentar);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_usuarios);
    }// GEN-LAST:event_btn_clientesMouseClicked

    private void btn_usuariosMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_usuariosMouseClicked
        // TODO add your handling code here:
        addPanel(usuarios);

        // Changing background colors
        selectedButton(btn_usuarios);
        deselectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_rentar);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_clientes);
    }// GEN-LAST:event_btn_usuariosMouseClicked

    /**
     * @param args the command line arguments
     */
    //    public static void main(String args[]) {
    //        /* Set the Nimbus look and feel */
    //        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    //        // (optional) ">
    //        /*
    //         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
    //         * look and feel.
    //         * For details see
    //         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    //         */
    //        try {
    //            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //                if ("Nimbus".equals(info.getName())) {
    //                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                    break;
    //                }
    //            }
    //        } catch (ClassNotFoundException ex) {
    //            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (InstantiationException ex) {
    //            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (IllegalAccessException ex) {
    //            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        }
    //        // </editor-fold>
    //
    //        /* Create and display the form */
    //        java.awt.EventQueue.invokeLater(new Runnable() {
    //            public void run() {
    //                new Menu().setVisible(true);
    //            }
    //        });
    //    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel btn_clientes;
    private javax.swing.JPanel btn_crear;
    private javax.swing.JPanel btn_prin;
    private javax.swing.JPanel btn_rentar;
    private javax.swing.JPanel btn_usuarios;
    private javax.swing.JPanel btn_vehiculos;
    private javax.swing.JLabel clients_icon;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel create_icon;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel home_icon;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel rent_icon;
    private javax.swing.JLabel rents_icon;
    private javax.swing.JLabel users_icon;
    // End of variables declaration//GEN-END:variables
}