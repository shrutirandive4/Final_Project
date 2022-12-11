/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author Shruti
 */
public class ReceptionistJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReceptionistJFrame
     */
    public ReceptionistJFrame() {
        initComponents();
        setSize(950, 600);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnManageGuests = new javax.swing.JButton();
        btnManageEmployees = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnGuestRecreationBooking = new javax.swing.JButton();
        btnBookings = new javax.swing.JButton();
        btnTravel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnManageGuests.setBackground(new java.awt.Color(255, 153, 51));
        btnManageGuests.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnManageGuests.setForeground(new java.awt.Color(255, 255, 255));
        btnManageGuests.setText("Manage Guests");
        btnManageGuests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageGuestsActionPerformed(evt);
            }
        });

        btnManageEmployees.setBackground(new java.awt.Color(255, 153, 51));
        btnManageEmployees.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnManageEmployees.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEmployees.setText("Manage Employees");
        btnManageEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeesActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 153, 51));
        btnLogout.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnGuestRecreationBooking.setBackground(new java.awt.Color(255, 153, 51));
        btnGuestRecreationBooking.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnGuestRecreationBooking.setForeground(new java.awt.Color(255, 255, 255));
        btnGuestRecreationBooking.setText("Guest Recreation");
        btnGuestRecreationBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuestRecreationBookingActionPerformed(evt);
            }
        });

        btnBookings.setBackground(new java.awt.Color(255, 153, 51));
        btnBookings.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBookings.setForeground(new java.awt.Color(255, 255, 255));
        btnBookings.setText("Bookings");
        btnBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingsActionPerformed(evt);
            }
        });

        btnTravel.setBackground(new java.awt.Color(255, 153, 51));
        btnTravel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnTravel.setForeground(new java.awt.Color(255, 255, 255));
        btnTravel.setText("Travel");
        btnTravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTravelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageGuests, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageEmployees)
                    .addComponent(btnBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuestRecreationBooking)
                    .addComponent(btnTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBookings, btnGuestRecreationBooking, btnLogout, btnManageEmployees, btnManageGuests, btnTravel});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnManageGuests)
                .addGap(18, 18, 18)
                .addComponent(btnManageEmployees)
                .addGap(18, 18, 18)
                .addComponent(btnBookings)
                .addGap(18, 18, 18)
                .addComponent(btnGuestRecreationBooking)
                .addGap(18, 18, 18)
                .addComponent(btnTravel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(21, 21, 21))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBookings, btnGuestRecreationBooking, btnLogout, btnManageEmployees, btnManageGuests, btnTravel});

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageGuestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageGuestsActionPerformed
        // TODO add your handling code here:
        ManageGuestsJPanel guests = new ManageGuestsJPanel();
        splitPane.setRightComponent(guests);
    }//GEN-LAST:event_btnManageGuestsActionPerformed

    private void btnManageEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeesActionPerformed
        // TODO add your handling code here:
        ManageEmployeesJPanel emp = new ManageEmployeesJPanel();
        splitPane.setRightComponent(emp);
    }//GEN-LAST:event_btnManageEmployeesActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        MainJFrame MainJFrame = new MainJFrame();
        MainJFrame.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnGuestRecreationBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuestRecreationBookingActionPerformed
        // TODO add your handling code here:
        GuestRecreationBookingJPanel guestRe = new GuestRecreationBookingJPanel();
        splitPane.setRightComponent(guestRe);
    }//GEN-LAST:event_btnGuestRecreationBookingActionPerformed

    private void btnBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingsActionPerformed
        // TODO add your handling code here:
        BookingsJPanel bookings = new BookingsJPanel();
        splitPane.setRightComponent(bookings);
    }//GEN-LAST:event_btnBookingsActionPerformed

    private void btnTravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTravelActionPerformed
        // TODO add your handling code here:
        TravelJPanel travel = new TravelJPanel();
        splitPane.setRightComponent(travel);
    }//GEN-LAST:event_btnTravelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReceptionistJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookings;
    private javax.swing.JButton btnGuestRecreationBooking;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageEmployees;
    private javax.swing.JButton btnManageGuests;
    private javax.swing.JButton btnTravel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
