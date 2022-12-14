/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import databaseconnection.EmployeeQueries;
import databaseconnection.TravelQueries;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Employee;

/**
 *
 * @author Shruti
 */
public class CityTourJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CityTourJPanel
     */
    public CityTourJPanel() {
        initComponents();
        populateDriverName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredPane = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblGuestEmail = new javax.swing.JLabel();
        txtGuestEmail = new javax.swing.JTextField();
        lblPickupTime = new javax.swing.JLabel();
        txtPickupTime = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lblCities = new javax.swing.JLabel();
        lblDriverName = new javax.swing.JLabel();
        comboBoxDriver = new javax.swing.JComboBox<>();
        comboBoxCity = new javax.swing.JComboBox<>();

        layeredPane.setBackground(new java.awt.Color(255, 255, 255));
        layeredPane.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Schedule City Tour");

        lblGuestEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblGuestEmail.setForeground(new java.awt.Color(51, 153, 255));
        lblGuestEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/3586360_email_envelope_mail_send_icon.png"))); // NOI18N
        lblGuestEmail.setText("Guest Email:");

        txtGuestEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtGuestEmail.setForeground(new java.awt.Color(51, 153, 255));

        lblPickupTime.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblPickupTime.setForeground(new java.awt.Color(51, 153, 255));
        lblPickupTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/211606_clock_icon.png"))); // NOI18N
        lblPickupTime.setText("Pickup Time:");

        txtPickupTime.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtPickupTime.setForeground(new java.awt.Color(51, 153, 255));

        btnAdd.setBackground(new java.awt.Color(255, 153, 51));
        btnAdd.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Book");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblCities.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblCities.setForeground(new java.awt.Color(51, 153, 255));
        lblCities.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4200473_address_location_map_navigation_icon.png"))); // NOI18N
        lblCities.setText("Cities:");

        lblDriverName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblDriverName.setForeground(new java.awt.Color(51, 153, 255));
        lblDriverName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5340287_man_people_person_user_users_icon.png"))); // NOI18N
        lblDriverName.setText("Driver Name:");

        comboBoxDriver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Castle Island", "FanPier", "Boston Public Library", "Northeastern University", "Harvard", "MIT" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPickupTime)
                                    .addComponent(txtPickupTime, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxDriver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDriverName))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCities)
                                    .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxDriver, lblCities, lblDriverName, lblGuestEmail, lblPickupTime, txtPickupTime});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPickupTime, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCities))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPickupTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lblDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxDriver, lblCities, lblDriverName, lblGuestEmail, lblPickupTime, txtPickupTime});

        layeredPane.add(jPanel1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(layeredPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(layeredPane))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String guestEmail = txtGuestEmail.getText();
        String pickUpTime = txtPickupTime.getText();
        String selectCity = (String) comboBoxCity.getSelectedItem();
        String selectDriver = (String) comboBoxDriver.getSelectedItem();
        String ScheduleCityTour = "City Tour";
       TravelQueries tq= new TravelQueries();
       tq.scheduleCityTour(guestEmail, pickUpTime, selectCity, ScheduleCityTour, selectDriver);
       JOptionPane.showMessageDialog(this, "City Tour Successfully ");
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> comboBoxCity;
    private javax.swing.JComboBox<String> comboBoxDriver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JLabel lblCities;
    private javax.swing.JLabel lblDriverName;
    private javax.swing.JLabel lblGuestEmail;
    private javax.swing.JLabel lblPickupTime;
    private javax.swing.JTextField txtGuestEmail;
    private javax.swing.JTextField txtPickupTime;
    // End of variables declaration//GEN-END:variables

    private void populateDriverName(){
    EmployeeQueries emp= new EmployeeQueries();
        try {
            for(String emp1: emp.getDriverName()){
                System.out.println(emp1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        comboBoxDriver.setModel(new DefaultComboBoxModel<String>(Employee.driverName.toArray(new String[0])));
        
    }
}
