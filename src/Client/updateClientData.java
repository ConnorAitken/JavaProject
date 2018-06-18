/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Login.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author saugat raut
 */
public class updateClientData extends javax.swing.JFrame {
     Connection conn = new DBConnection().connect();

    /**
     * Creates new form updateClientData
     */
    public updateClientData() {
        initComponents();
        idTextField.setVisible(false);
        userTextField.setVisible(false);
        passTextField.setVisible(false);
        
        String sql = "Select * From temp";
                    try {
                        PreparedStatement ps = conn.prepareStatement(sql);
                        ResultSet rs = ps.executeQuery();
                        if (rs.next()) {
                            String User = rs.getString("username");
                            userTextField.setText(User);
                            String Pass = rs.getString("password");
                            passTextField.setText(Pass);
                            JOptionPane.showMessageDialog(null, "done1");
                            }
                    }
                    catch (Exception e){}
                    
        String sql2 = "Select * From userclient Where username=? And password=?";
                    try {
                        PreparedStatement ps2 = conn.prepareStatement(sql2);
                        ps2.setString(1, userTextField.getText());
                        ps2.setString(2, passTextField.getText());
                        ResultSet rs2 = ps2.executeQuery();
                        if (rs2.next()) {
                            String ID = rs2.getString("id");
                            idTextField.setText(ID);
                            
                String FN = rs2.getString("firstname");
                jTextField_Firstname.setText(FN);
                String LN = rs2.getString("lastname");
                jTextField_Lastname.setText(LN);
                String age = rs2.getString("age");
               jTextField_Age.setText(age);
                String User = rs2.getString("username");
                jTextField_Username.setText(User);
                String Pass = rs2.getString("password");
                jPasswordField_Password.setText(Pass);
                String email = rs2.getString("email");
                jTextField_Email.setText(email);
                String contact = rs2.getString("contactNo");
                jTextField_Contact.setText(contact);
                String address = rs2.getString("address");
                jTextField_Address.setText(address);
                String guardainName = rs2.getString("guardianName");
                jTextField_Guardianname.setText(guardainName);
                String guardainAdd = rs2.getString("guardianContact");
                jTextField_Gcontact.setText(guardainAdd);
                            
                            JOptionPane.showMessageDialog(null, "done2");
                            }
                    }
                    catch (Exception e){}
                    
                    
                    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Firstname = new javax.swing.JLabel();
        jLabel_lastname = new javax.swing.JLabel();
        jLabel_Age = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Contact = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jLabel_Gname = new javax.swing.JLabel();
        jLabel_Gcontact = new javax.swing.JLabel();
        jTextField_Gcontact = new javax.swing.JTextField();
        jTextField_Guardianname = new javax.swing.JTextField();
        jTextField_Address = new javax.swing.JTextField();
        jTextField_Contact = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jTextField_Username = new javax.swing.JTextField();
        jTextField_Age = new javax.swing.JTextField();
        jTextField_Lastname = new javax.swing.JTextField();
        jTextField_Firstname = new javax.swing.JTextField();
        userTextField = new javax.swing.JTextField();
        jButton_update = new javax.swing.JButton();
        passTextField = new javax.swing.JTextField();
        jButton_Back = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        jButton_Exit = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Client Details");

        jLabel_Firstname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Firstname.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Firstname.setText("First Name:");

        jLabel_lastname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_lastname.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_lastname.setText("Last Name:");

        jLabel_Age.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Age.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Age.setText("Age:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");

        jLabel_Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setText("Password:");

        jLabel_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setText("Email:");

        jLabel_Contact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Contact.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Contact.setText("Contact no:");

        jLabel_Address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Address.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Address.setText("Address:");

        jLabel_Gname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Gname.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Gname.setText("Guardian Name:");

        jLabel_Gcontact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Gcontact.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Gcontact.setText("Guardian Contact No:");

        userTextField.setText("jTextField1");

        jButton_update.setText("Update");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        passTextField.setText("jTextField1");

        jButton_Back.setText("Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        idTextField.setText("jTextField1");

        jButton_Exit.setText("Exit");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Gcontact)
                            .addComponent(jLabel_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_lastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Firstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel_Password)
                            .addComponent(jLabel_Email)
                            .addComponent(jLabel_Contact)
                            .addComponent(jLabel_Address)
                            .addComponent(jLabel_Gname))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Guardianname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Back))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField_Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addComponent(jTextField_Age, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Lastname, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Firstname, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField_Address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(jTextField_Contact, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_Gcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addComponent(jButton_update)))
                                .addGap(0, 266, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(passTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Exit)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Firstname)
                    .addComponent(jTextField_Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_lastname)
                    .addComponent(jTextField_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Age)
                    .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Password)
                    .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Email)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Contact)
                    .addComponent(jTextField_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Address)
                    .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Gname)
                    .addComponent(jTextField_Guardianname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Gcontact)
                    .addComponent(jTextField_Gcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Back)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Exit))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        
        String firstname =jTextField_Firstname.getText();
        String lastname =jTextField_Lastname.getText();
        String age = jTextField_Age.getText();
        String username =jTextField_Username.getText();
        String password =jPasswordField_Password.getText(); 
        String email =jTextField_Email.getText();
        String contactNo =jTextField_Contact.getText();
        String address =jTextField_Address.getText();
        String guardainName =jTextField_Guardianname.getText();
        String guardainContact =jTextField_Gcontact.getText();
        
        if(firstname.equals("") | lastname.equals("") | age.equals("") | username.equals("") | password.equals("") | email.equals("") | contactNo.equals("") | address.equals("") | guardainName.equals("") | guardainContact.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fields");
        } else {
          PreparedStatement ps;
          String query = "UPDATE userclient SET firstname=?,lastname=?,age=?,username=?,password=?,email=?,contactNo=?,address=?,guardianName=?,guardianContact=? WHERE id=?";
          try{
               ps = conn.prepareStatement(query);
               ps.setString(1, firstname);
               ps.setString(2, lastname);
               ps.setString(3, age);
               ps.setString(4, username);
               ps.setString(5, password);
               ps.setString(6, email);
               ps.setString(7, contactNo);
               ps.setString(8, address);
               ps.setString(9, guardainName);
               ps.setString(10,guardainContact);
               ps.setString(11, idTextField.getText());
               ps.executeUpdate();
                 if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Updated");
                    
                }
                
          }catch(Exception e){}
          
            
        }
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        contentsClient frame = new  contentsClient();
        frame.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed

        String delete = "TRUNCATE TABLE temp";
        try {
        PreparedStatement psDel = conn.prepareStatement(delete);
        psDel.executeUpdate();
        } catch (Exception e){}
        
        System.exit(0);
    }//GEN-LAST:event_jButton_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(updateClientData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateClientData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateClientData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateClientData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateClientData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_Age;
    private javax.swing.JLabel jLabel_Contact;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Firstname;
    private javax.swing.JLabel jLabel_Gcontact;
    private javax.swing.JLabel jLabel_Gname;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_lastname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Age;
    private javax.swing.JTextField jTextField_Contact;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Firstname;
    private javax.swing.JTextField jTextField_Gcontact;
    private javax.swing.JTextField jTextField_Guardianname;
    private javax.swing.JTextField jTextField_Lastname;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JTextField passTextField;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
