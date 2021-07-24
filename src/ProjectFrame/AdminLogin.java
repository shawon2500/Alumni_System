/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFrame;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ARNAB
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
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

        heading = new javax.swing.JLabel();
        emailicon = new javax.swing.JLabel();
        passicon = new javax.swing.JLabel();
        emailtext = new javax.swing.JLabel();
        passtext = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        backbutton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        heading.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(0, 0, 0));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("Admin Login");
        getContentPane().add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 230, 70));

        emailicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectFrame/email.png"))); // NOI18N
        getContentPane().add(emailicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 60, 50));

        passicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectFrame/password.png"))); // NOI18N
        getContentPane().add(passicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        emailtext.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        emailtext.setText("Email        : ");
        getContentPane().add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 140, -1));

        passtext.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        passtext.setText("Password  :");
        getContentPane().add(passtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 140, -1));

        email.setBackground(new java.awt.Color(204, 204, 255));
        email.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 300, 50));

        btnlogin.setBackground(new java.awt.Color(255, 255, 255));
        btnlogin.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectFrame/user login.png"))); // NOI18N
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 150, 60));

        password.setBackground(new java.awt.Color(204, 204, 255));
        password.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 300, 50));

        backbutton.setBackground(new java.awt.Color(204, 204, 255));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectFrame/backbutton.png"))); // NOI18N
        backbutton.setBorder(null);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectFrame/background.jpg"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1366, 786));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        try {
             Connection con = DriverManager.getConnection(
                        "jdbc:mysql://remotemysql.com:3306/T9v30NLyLY", "T9v30NLyLY", "7tSss4hcEf");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from admin where Email = '" + email.getText() + "'");
            rs.next();

            String pass = rs.getString("Password");
            
            String mat = password.getText();
            
            if (pass.equals(mat)) {
                this.setVisible(false);
               AdminFrame sd = new AdminFrame();
                //UserDashboard ud =new UserDashboard(pass);

                sd.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Email or Password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } catch (HeadlessException | SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
       loginpage u=new loginpage();
        this.setVisible(false);
        u.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnlogin;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailicon;
    private javax.swing.JLabel emailtext;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel passicon;
    private javax.swing.JLabel passtext;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}