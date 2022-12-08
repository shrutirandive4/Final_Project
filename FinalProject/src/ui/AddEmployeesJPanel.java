/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author Shruti
 */
public class AddEmployeesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEmployeesJPanel
     */
    public AddEmployeesJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        comboBoxRole = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        lblSalary = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 153, 255));
        lblName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5340287_man_people_person_user_users_icon.png"))); // NOI18N
        lblName.setText("Name:");

        txtName.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 153, 255));

        lblEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 153, 255));
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/3586360_email_envelope_mail_send_icon.png"))); // NOI18N
        lblEmail.setText("Email:");

        lblPhoneNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblPhoneNo.setForeground(new java.awt.Color(51, 153, 255));
        lblPhoneNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/172517_phone_icon (1).png"))); // NOI18N
        lblPhoneNo.setText("Phone No.:");

        lblAddress.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(51, 153, 255));
        lblAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4200473_address_location_map_navigation_icon.png"))); // NOI18N
        lblAddress.setText("Address:");

        txtPhoneNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtPhoneNo.setForeground(new java.awt.Color(51, 153, 255));

        txtEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(51, 153, 255));

        lblRole.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblRole.setForeground(new java.awt.Color(51, 153, 255));
        lblRole.setText("Role:");
        lblRole.setPreferredSize(new java.awt.Dimension(49, 16));

        txtAddress.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(51, 153, 255));

        comboBoxRole.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        comboBoxRole.setForeground(new java.awt.Color(51, 153, 255));
        comboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Recptionist", "Driver", "HouseKeeping", "Recreation Admin", "Accountant" }));

        btnAdd.setBackground(new java.awt.Color(255, 153, 51));
        btnAdd.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");

        lblSalary.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblSalary.setForeground(new java.awt.Color(51, 153, 255));
        lblSalary.setText("Salary:");

        txtSalary.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtSalary.setForeground(new java.awt.Color(51, 153, 255));

        lblTitle.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 153, 51));
        lblTitle.setText("Employee Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblSalary))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneNo)
                                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(lblEmail)
                                    .addComponent(lblAddress)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxRole, lblAddress, lblEmail, lblName, lblPhoneNo, lblRole, lblSalary, txtAddress, txtEmail, txtName, txtPhoneNo, txtSalary});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(lblPhoneNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAddress, lblEmail, lblName, lblPhoneNo, txtEmail, txtName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblRole, lblSalary});

    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> comboBoxRole;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
