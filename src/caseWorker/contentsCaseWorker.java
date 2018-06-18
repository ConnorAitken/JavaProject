/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseWorker;

import java.awt.Color;


/**
 *
 * @author saugat raut
 *          
 */
public class contentsCaseWorker extends javax.swing.JFrame {

    /**
     * Creates new form contentsCaseWorker
     */
    public contentsCaseWorker() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CaseWorker = new javax.swing.JLabel();
        UpdateClient = new javax.swing.JLabel();
        ClientAttendance = new javax.swing.JLabel();
        CreateIndustry = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        ClientCourse = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(50, 50, 50));

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));

        CaseWorker.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CaseWorker.setForeground(new java.awt.Color(255, 255, 255));
        CaseWorker.setText("Update Case Worker");
        CaseWorker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CaseWorkerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CaseWorkerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CaseWorkerMouseExited(evt);
            }
        });

        UpdateClient.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UpdateClient.setForeground(new java.awt.Color(255, 255, 255));
        UpdateClient.setText("Update Client Details");
        UpdateClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateClientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateClientMouseExited(evt);
            }
        });

        ClientAttendance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ClientAttendance.setForeground(new java.awt.Color(255, 255, 255));
        ClientAttendance.setText("Client Attendance Report");
        ClientAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientAttendanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClientAttendanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClientAttendanceMouseExited(evt);
            }
        });

        CreateIndustry.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CreateIndustry.setForeground(new java.awt.Color(255, 255, 255));
        CreateIndustry.setText("Insert Client Unit Data");
        CreateIndustry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateIndustryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateIndustryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateIndustryMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu");

        Exit.setText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        ClientCourse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ClientCourse.setForeground(new java.awt.Color(255, 255, 255));
        ClientCourse.setText("Client Course Report");
        ClientCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientCourseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClientCourseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClientCourseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(466, 466, 466)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(394, 394, 394)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UpdateClient)
                                    .addComponent(CaseWorker)
                                    .addComponent(CreateIndustry)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(372, 372, 372)
                                .addComponent(ClientAttendance)))
                        .addGap(0, 378, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Exit)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(ClientCourse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(CaseWorker)
                .addGap(34, 34, 34)
                .addComponent(UpdateClient)
                .addGap(34, 34, 34)
                .addComponent(CreateIndustry)
                .addGap(34, 34, 34)
                .addComponent(ClientAttendance)
                .addGap(34, 34, 34)
                .addComponent(ClientCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(Exit)
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void CaseWorkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaseWorkerMouseClicked
        updateCaseWorkerDetails frame = new updateCaseWorkerDetails();
        frame.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_CaseWorkerMouseClicked

    private void UpdateClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateClientMouseClicked
        createOrUpdateClientDetails frame = new createOrUpdateClientDetails();
        frame.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_UpdateClientMouseClicked

    private void CreateIndustryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateIndustryMouseClicked
         updateClientCourseDetails frame = new  updateClientCourseDetails();
        frame.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_CreateIndustryMouseClicked

    private void ClientAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientAttendanceMouseClicked
        clientAttendanceReport frame = new  clientAttendanceReport();
        frame.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_ClientAttendanceMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void CaseWorkerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaseWorkerMouseEntered
        CaseWorker.setForeground(new Color(1, 175, 202));
        String underline = "<html><u> Update Case Worker</u></html>";
        CaseWorker.setText(underline);
    }//GEN-LAST:event_CaseWorkerMouseEntered

    private void CaseWorkerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaseWorkerMouseExited
        // TODO add your handling code here:
        CaseWorker.setForeground(Color.WHITE);
        String underline = "Update Case Worker";
        CaseWorker.setText(underline);
    }//GEN-LAST:event_CaseWorkerMouseExited

    private void UpdateClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateClientMouseEntered
        UpdateClient.setForeground(new Color(1, 175, 202));
        String underline = "<html><u> Update Client Details</u></html>";
        UpdateClient.setText(underline);
    }//GEN-LAST:event_UpdateClientMouseEntered

    private void UpdateClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateClientMouseExited
        // TODO add your handling code here:
        UpdateClient.setForeground(Color.WHITE);
        String underline = "Update Client Details";
        UpdateClient.setText(underline);
    }//GEN-LAST:event_UpdateClientMouseExited

    private void ClientAttendanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientAttendanceMouseEntered
        // TODO add your handling code here:
        ClientAttendance.setForeground(new Color(1, 175, 202));
        String underline = "<html><u> Client Attendance Report</u></html>";
        ClientAttendance.setText(underline);
    }//GEN-LAST:event_ClientAttendanceMouseEntered

    private void ClientAttendanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientAttendanceMouseExited
        // TODO add your handling code here:
        ClientAttendance.setForeground(Color.WHITE);
        String underline = "Client Attendance Report";
        ClientAttendance.setText(underline);
    }//GEN-LAST:event_ClientAttendanceMouseExited

    private void CreateIndustryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateIndustryMouseEntered
        // TODO add your handling code here:
        CreateIndustry.setForeground(new Color(1, 175, 202));
        String underline = "<html><u> Insert Client Unit Data</u></html>";
        CreateIndustry.setText(underline);
    }//GEN-LAST:event_CreateIndustryMouseEntered

    private void CreateIndustryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateIndustryMouseExited
        // TODO add your handling code here:
        CreateIndustry.setForeground(Color.WHITE);
        String underline = "Insert Client Unit Data";
        CreateIndustry.setText(underline);
    }//GEN-LAST:event_CreateIndustryMouseExited

    private void ClientCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientCourseMouseClicked
        // TODO add your handling code here:
        clientCourseReport frame = new  clientCourseReport();
        frame.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_ClientCourseMouseClicked

    private void ClientCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientCourseMouseEntered
        // TODO add your handling code here:
        ClientCourse.setForeground(new Color(1, 175, 202));
        String underline = "<html><u> Client Course Report</u></html>";
        ClientCourse.setText(underline);
    }//GEN-LAST:event_ClientCourseMouseEntered

    private void ClientCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientCourseMouseExited
        // TODO add your handling code here:
        ClientCourse.setForeground(Color.WHITE);
        String underline = "Client Course Report";
        ClientCourse.setText(underline);
    }//GEN-LAST:event_ClientCourseMouseExited

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
            java.util.logging.Logger.getLogger(contentsCaseWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contentsCaseWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contentsCaseWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contentsCaseWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contentsCaseWorker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CaseWorker;
    private javax.swing.JLabel ClientAttendance;
    private javax.swing.JLabel ClientCourse;
    private javax.swing.JLabel CreateIndustry;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel UpdateClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
