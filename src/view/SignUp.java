/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.RegisterController;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.*;
import controller.*;
import database.*;
import java.sql.*;


public class SignUp extends javax.swing.JFrame {
    RegisterModel model;
    
    
    public SignUp() {
        initComponents();
    }
    
    public RegisterModel getUser(){
       model= new RegisterModel(txtfname.getText(), txtlname.getText(),txtemail.getText(),txtphone.getText(), txtUsername.getText(), txtpass.getText(), answer.getText(), securityque.getItemAt(WIDTH));
       return  model;
   }
    
    public void setMessage(String msg){
       JOptionPane.showMessageDialog(this, msg);
   }
    
    public void  myreset(){
        txtfname.setText("");
        txtlname.setText("");
        txtemail.setText("");
        txtphone.setText("");
        txtUsername.setText("");
        txtpass.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        lname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        phone = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        securityque = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(450, 200));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Create a New Account");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 240, -1));

        fname.setBackground(new java.awt.Color(255, 204, 204));
        fname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fname.setText("First Name");
        jLayeredPane1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 110, -1, -1));

        txtfname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtfname.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });
        jLayeredPane1.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, 20));

        txtlname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtlname.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });
        jLayeredPane1.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 110, 160, 21));

        lname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lname.setText("Last Name");
        jLayeredPane1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 110, -1, -1));

        email.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        email.setText("Email");
        jLayeredPane1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 151, -1, -1));

        txtemail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtemail.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        txtemail.setPreferredSize(new java.awt.Dimension(120, 20));
        jLayeredPane1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 149, 160, -1));

        phone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        phone.setText("Phone Number");
        jLayeredPane1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 150, -1, -1));

        txtphone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtphone.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        txtphone.setMinimumSize(new java.awt.Dimension(120, 20));
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        jLayeredPane1.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 150, 160, 21));

        txtpass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtpass.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        txtpass.setMinimumSize(new java.awt.Dimension(120, 20));
        txtpass.setPreferredSize(new java.awt.Dimension(120, 20));
        jLayeredPane1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 190, 160, 21));

        pass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pass.setText("Password");
        jLayeredPane1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 190, -1, -1));

        Username.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Username.setText("Username");
        jLayeredPane1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 189, -1, -1));

        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        txtUsername.setPreferredSize(new java.awt.Dimension(120, 20));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jLayeredPane1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 187, 160, -1));

        register.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        register.setText("Sign Up");
        register.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jLayeredPane1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 306, 73, -1));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTextField7.setText("Already have an account?");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 346, -1, -1));

        Login.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Login.setText("Login");
        Login.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Login.setBorderPainted(false);
        Login.setContentAreaFilled(false);
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 346, 80, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Security Question");
        jLayeredPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 225, -1, -1));

        securityque.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        securityque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your security question", "What is your nick name?", "What is your fav food?", "What is your pet's name?", " " }));
        securityque.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        securityque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityqueActionPerformed(evt);
            }
        });
        jLayeredPane1.add(securityque, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 224, 245, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Answer");
        jLayeredPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 264, -1, -1));

        answer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        answer.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jLayeredPane1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 262, 245, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(304, 327));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CODER'S");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CAFE");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter your details and get ready to dive into our system.");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(145, 145, 145))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(212, 212, 212)
                .addComponent(jLabel6)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
          RegisterController r =new RegisterController(this);

            
    }//GEN-LAST:event_registerActionPerformed

    public void addLoginListener(ActionListener log){
        register.addActionListener(log);
    }
    
    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void securityqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityqueActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        LoginRMS lg = new LoginRMS();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginActionPerformed

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    
   

    
    
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField answer;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fname;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel phone;
    private javax.swing.JButton register;
    private javax.swing.JComboBox<String> securityque;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
