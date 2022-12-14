/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import databaseconnection.EmployeeQueries;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Employee;

/**
 *
 * @author Shruti
 */
public class ManageEmployeesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    Employee emp = new Employee();
    public ManageEmployeesJPanel() {
        initComponents();
        populateTable();        
    }
    public void switchPanels(JPanel panel){
            layeredPane.removeAll();
            layeredPane.add(panel);
            layeredPane.repaint();
            layeredPane.revalidate();
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
        jPanel3 = new javax.swing.JPanel();
        btnAddEmployees = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        btnUpdateEmployees = new javax.swing.JButton();
        btnDeleteEmployees = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPhoneNo = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblSalary = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        layeredPane.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnAddEmployees.setBackground(new java.awt.Color(255, 153, 51));
        btnAddEmployees.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddEmployees.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployees.setText("Add Employees");
        btnAddEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeesActionPerformed(evt);
            }
        });

        tblEmployees.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblEmployees.setForeground(new java.awt.Color(255, 153, 51));
        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Email", "PhoneNo", "Address", "Salary", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        btnUpdateEmployees.setBackground(new java.awt.Color(255, 153, 51));
        btnUpdateEmployees.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnUpdateEmployees.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateEmployees.setText("Update");
        btnUpdateEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmployeesActionPerformed(evt);
            }
        });

        btnDeleteEmployees.setBackground(new java.awt.Color(255, 153, 51));
        btnDeleteEmployees.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnDeleteEmployees.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEmployees.setText("Delete");
        btnDeleteEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeesActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 153, 255));
        lblName.setText("Name:");

        txtName.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 153, 255));

        lblPhoneNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblPhoneNo.setForeground(new java.awt.Color(51, 153, 255));
        lblPhoneNo.setText("Phone No.:");

        txtPhoneNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtPhoneNo.setForeground(new java.awt.Color(51, 153, 255));

        lblAddress.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(51, 153, 255));
        lblAddress.setText("Address:");

        txtAddress.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(51, 153, 255));

        lblSalary.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblSalary.setForeground(new java.awt.Color(51, 153, 255));
        lblSalary.setText("Salary:");

        txtSalary.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtSalary.setForeground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Employees");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhoneNo)
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalary)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addGap(66, 66, 66)
                        .addComponent(btnUpdateEmployees)
                        .addGap(59, 59, 59)
                        .addComponent(btnDeleteEmployees)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddEmployees)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAddress, lblName, lblPhoneNo, lblSalary, txtAddress, txtName, txtPhoneNo, txtSalary});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdateEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40)
                .addComponent(lblPhoneNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblSalary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAddress, lblPhoneNo, lblSalary, txtAddress, txtName, txtPhoneNo, txtSalary});

        layeredPane.add(jPanel3, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeesActionPerformed
        // TODO add your handling code here:
        AddEmployeesJPanel addEmp = new AddEmployeesJPanel();
        switchPanels(addEmp);
    }//GEN-LAST:event_btnAddEmployeesActionPerformed

    private void btnUpdateEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeesActionPerformed
        // TODO add your handling code here:
       DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        int selectedRowIndex = tblEmployees.getSelectedRow();
        
        Employee selectedEmp = (Employee) model.getValueAt(selectedRowIndex, 0);
        if (tblEmployees.getSelectedRowCount()==1){
            //-- if single row is selected than update--
            String name = txtName.getText();
            String email = selectedEmp.getEmailAddress();
            Long phone_no = Long.parseLong(txtPhoneNo.getText());
            String address = txtAddress.getText();
            int salary = Integer.parseInt(txtSalary.getText());
            
            if (name.equals("") || phone_no.equals("") || 
                    address.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter all the fields");
                return;   
            }
            
            EmployeeQueries updateSelectedEmployee = new EmployeeQueries();            
              try {
                  updateSelectedEmployee.updateEmp(name, email, phone_no, address, salary);
                  System.out.print("Updated!!");
              } 
              catch (SQLException ex) {
                  Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
              }
              
            emp.updateEmployee(selectedEmp, selectedRowIndex);
            JOptionPane.showMessageDialog(this, "Employee Updated Successfully ");
            populateTable();

        

        }
    }//GEN-LAST:event_btnUpdateEmployeesActionPerformed

    private void btnDeleteEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeesActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEmployees.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex, 0);
        emp.deleteEmployee(selectedEmployee);
        String email = selectedEmployee.getEmailAddress();
        
        EmployeeQueries deleteSelectedEmployee = new EmployeeQueries();            
              try {
                  deleteSelectedEmployee.deleteSelectedEmp(email);
                  System.out.print("Deleted!!");
              } 
              catch (SQLException ex) {
                  Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
              }
        JOptionPane.showMessageDialog(this,"Employee deleted");
        txtName.setText("");
//        txtEmail.setText(selectedEmp.getEmailAddress());
        txtPhoneNo.setText("");
        txtAddress.setText("");
        txtSalary.setText("");
        
        populateTable();

    }//GEN-LAST:event_btnDeleteEmployeesActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblEmployees.getSelectedRow(); 
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        
        Employee selectedEmp = (Employee) model.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedEmp);
        
        txtName.setText(selectedEmp.getName());
//        txtEmail.setText(selectedEmp.getEmailAddress());
        txtPhoneNo.setText(Long.toString(selectedEmp.getCellphoneNo()));
        txtAddress.setText(selectedEmp.getAddress());
        txtSalary.setText(Integer.toString(selectedEmp.getSalary()));
    }//GEN-LAST:event_tblEmployeesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployees;
    private javax.swing.JButton btnDeleteEmployees;
    private javax.swing.JButton btnUpdateEmployees;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables


public void populateTable()  {
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        model.setRowCount(0);
        EmployeeQueries emp= new EmployeeQueries();
        
        try {
            for(Employee emp1: emp.getEmp()){
                Object[] row = new Object[6];
                row[0] = emp1;
                row[1] = emp1.getEmailAddress();
                row[2] = emp1.getCellphoneNo();
                row[3] = emp1.getAddress();
                row[4] = emp1.getSalary();
                row[5] = emp1.getRole();
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageEmployeesJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}


