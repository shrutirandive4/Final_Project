/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author Shruti
 */
public class RecreationAdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form RecreationAdminJFrame
     */
    public RecreationAdminJFrame() {
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
        btnAddRecreation = new javax.swing.JButton();
        btnManageRecreation = new javax.swing.JButton();
        btnRecreationBooking = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAddRecreation.setBackground(new java.awt.Color(255, 153, 51));
        btnAddRecreation.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddRecreation.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRecreation.setText("Add Recreation");
        btnAddRecreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecreationActionPerformed(evt);
            }
        });

        btnManageRecreation.setBackground(new java.awt.Color(255, 153, 51));
        btnManageRecreation.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnManageRecreation.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRecreation.setText("Manage Recreation");
        btnManageRecreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRecreationActionPerformed(evt);
            }
        });

        btnRecreationBooking.setBackground(new java.awt.Color(255, 153, 51));
        btnRecreationBooking.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnRecreationBooking.setForeground(new java.awt.Color(255, 255, 255));
        btnRecreationBooking.setText("Guest Booking");
        btnRecreationBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecreationBookingActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddRecreation)
                    .addComponent(btnManageRecreation)
                    .addComponent(btnRecreationBooking)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddRecreation, btnLogout, btnManageRecreation, btnRecreationBooking});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddRecreation)
                .addGap(41, 41, 41)
                .addComponent(btnManageRecreation)
                .addGap(39, 39, 39)
                .addComponent(btnRecreationBooking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(21, 21, 21))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddRecreation, btnLogout, btnManageRecreation, btnRecreationBooking});

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRecreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecreationActionPerformed
        // TODO add your handling code here:
        AddRecreationJPanel recreation = new AddRecreationJPanel();
        splitPane.setRightComponent(recreation);
    }//GEN-LAST:event_btnAddRecreationActionPerformed

    private void btnManageRecreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRecreationActionPerformed
        // TODO add your handling code here:
        ManageRecreationJPanel managerecreation = new ManageRecreationJPanel();
        splitPane.setRightComponent(managerecreation);
    }//GEN-LAST:event_btnManageRecreationActionPerformed

    private void btnRecreationBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecreationBookingActionPerformed
        // TODO add your handling code here:
        GuestRecreationBookingJPanel guestRecreation = new GuestRecreationBookingJPanel();
        splitPane.setRightComponent(guestRecreation);
    }//GEN-LAST:event_btnRecreationBookingActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        MainJFrame MainJFrame = new MainJFrame();
        MainJFrame.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(RecreationAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecreationAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecreationAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecreationAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecreationAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRecreation;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageRecreation;
    private javax.swing.JButton btnRecreationBooking;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
