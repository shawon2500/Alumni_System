/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFrame;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ARNAB
 */
public class UserDashboard extends javax.swing.JFrame {

    public static int d = LoginUser.a;

    /**
     * Creates new form UserDashboard
     */
    public UserDashboard() {
        super("Institute of Information Technology, Alumni Association ");
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

        title = new javax.swing.JLabel();
        btnsearchstu = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnnotice = new javax.swing.JButton();
        btnsearchteacher = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 102, 102));
        title.setText("USER DASHBOARD");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, 40));

        btnsearchstu.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnsearchstu.setText("SEARCH ANY STUDENT");
        btnsearchstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchstuActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearchstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 290, 90));

        btnlogout.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnlogout.setText("LOGOUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 310, 90));

        btnupdate.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnupdate.setText("UPDATE OWN INFO");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 270, 90));

        btnnotice.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnnotice.setText("NOTICE AND ANNOUNCEMENTS");
        btnnotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnoticeActionPerformed(evt);
            }
        });
        getContentPane().add(btnnotice, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 310, 90));

        btnsearchteacher.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnsearchteacher.setText("SEARCH ANY TEACHER");
        btnsearchteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchteacherActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearchteacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 290, 90));

        btnview.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnview.setText("VIEW OWN INFO");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        getContentPane().add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 270, 90));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectFrame/background.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1366, 786));
        background.setMinimumSize(new java.awt.Dimension(1366, 786));
        background.setPreferredSize(new java.awt.Dimension(1366, 786));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, -1, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnoticeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Newss sd = new Newss();
        sd.setVisible(true);
    }//GEN-LAST:event_btnnoticeActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ProjectFrame1 sd = new ProjectFrame1();
        sd.setVisible(true);

    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        if (d == 2) {
            this.setVisible(false);
            ViewOwnTeacher sd = new ViewOwnTeacher();
            sd.setVisible(true);
        } else {
            this.setVisible(false);
            ViewOwn sd = new ViewOwn();
            sd.setVisible(true);
        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        if (LoginUser.a == 1) {
            this.setVisible(false);
            UpdateStudentUser sd = new UpdateStudentUser();
            sd.setVisible(true);
        } else {
            this.setVisible(false);
            UpdateTeacher sd = new UpdateTeacher();
            sd.setVisible(true);
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsearchstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchstuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SearchStudent sd = new SearchStudent();
        sd.setVisible(true);
    }//GEN-LAST:event_btnsearchstuActionPerformed

    private void btnsearchteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchteacherActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SearchTeacher sd = new SearchTeacher();
        sd.setVisible(true);
    }//GEN-LAST:event_btnsearchteacherActionPerformed

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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnnotice;
    private javax.swing.JButton btnsearchstu;
    private javax.swing.JButton btnsearchteacher;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}