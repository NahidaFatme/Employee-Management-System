/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.management.system;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author pc
 */
public class Admin_Leave_application extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeLeaveApplicationAdmin
     */
    public Admin_Leave_application() {
        initComponents();
    }

    public void refresh(){
    try {
            int count;
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ems","root","");
            
            PreparedStatement pst = con.prepareStatement("select * from application");
            
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rd =rs.getMetaData();
            
            count = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) application_table.getModel();
            
            df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                for (int i =1; i<= count; i++)
                {
                      v2.add(rs.getString("number"));
                      v2.add(rs.getString("id"));
                      v2.add(rs.getString("start_date"));
                      v2.add(rs.getString("end_date"));
                      v2.add(rs.getString("reason"));
                      v2.add(rs.getString("status"));
                      
             
                }
                
                df.addRow(v2);
            }
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error");
            Logger.getLogger(Admin_Leave_application.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error in database");
            Logger.getLogger(Admin_Leave_application.class.getName()).log(Level.SEVERE, null, ex);
        }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        application_table = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        update = new javax.swing.JToggleButton();
        number = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        application_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        application_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID", "From", "To", "Reason", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        application_table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                application_tableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                application_tableAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        application_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                application_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(application_table);

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton1.setText("Back");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("| Employee Leave Applications");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Admin |");

        update.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        number.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Declined" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        Admin_Dashboard adb = new Admin_Dashboard();
        adb.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void application_tableAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_application_tableAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_application_tableAncestorMoved

    private void application_tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_application_tableAncestorAdded
        // TODO add your handling code here: show info on table
        try {
            int count;
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ems","root","");
            
            PreparedStatement pst = con.prepareStatement("select * from application");
            
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rd =rs.getMetaData();
            
            count = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) application_table.getModel();
            
            df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                for (int i =1; i<= count; i++)
                {
                      v2.add(rs.getString("number"));
                      v2.add(rs.getString("id"));
                      v2.add(rs.getString("start_date"));
                      v2.add(rs.getString("end_date"));
                      v2.add(rs.getString("reason"));
                      v2.add(rs.getString("status"));
                      
             
                }
                
                df.addRow(v2);
            }
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error");
            Logger.getLogger(Admin_Leave_application.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error in database");
            Logger.getLogger(Admin_Leave_application.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_application_tableAncestorAdded

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here: status update
        
         DefaultTableModel Df = (DefaultTableModel)application_table.getModel();
         int selectedIndex = application_table.getSelectedRow();
         
        try{
           
           Class.forName("com.mysql.jdbc.Driver");  // for database connection
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ems","root","");
           
           String sql=("UPDATE application SET status=? WHERE number=?");
           
           PreparedStatement pst= con.prepareStatement(sql);
           
           pst.setString(2,number.getText());
           pst.setString(1,status.getSelectedItem().toString());
           
           pst.executeUpdate();
           refresh();
           
            JOptionPane.showMessageDialog(this, "Status Update !!");
            
        
             //status.setText("");
             number.setText("");
             
        
        
        }
        catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error !!");
                Logger.getLogger(Admin_View_Salary.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error in SQL!!");
                Logger.getLogger(Admin_View_Salary.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_updateActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void application_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_application_tableMouseClicked
        // TODO add your handling code here: view table in field box
         DefaultTableModel Df = (DefaultTableModel)application_table.getModel();
        int selectedIndex = application_table.getSelectedRow();
        
        
        number.setText(Df.getValueAt(selectedIndex, 0).toString());
        
        
    }//GEN-LAST:event_application_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_Leave_application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Leave_application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Leave_application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Leave_application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Leave_application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable application_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField number;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JToggleButton update;
    // End of variables declaration//GEN-END:variables
}
