/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;


import java.sql.SQLException;
import javax.swing.JOptionPane;
import trandpl.dao.userDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.UserPojo;

public class LoginFrame extends javax.swing.JFrame {

   private String userId;
   private String password;
    
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private String validateUser(){
        if(jrbAdmin.isSelected())
            return "Admin";
        else if(jrbHr.isSelected())
            return "Hr";
        else if(jrbUser.isSelected())
            return "Student";
        else
            return null;
    }
    private boolean validateInputs(){
       userId=txtMail.getText().trim();
       char []pwd=txtpass.getPassword();
        if(userId.isEmpty()|| pwd.length==0)
            return false;
        password=String.valueOf(pwd);
        return true;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrbAdmin = new javax.swing.JRadioButton();
        jrbHr = new javax.swing.JRadioButton();
        jrbUser = new javax.swing.JRadioButton();
        btnLogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setText("Email or User Id:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 160, 140, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 250, 100, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setText("Select User Type:-");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 360, 150, 18);

        jrbAdmin.setBackground(new java.awt.Color(243, 246, 254));
        jrbAdmin.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jrbAdmin.setText("Admin");
        jPanel1.add(jrbAdmin);
        jrbAdmin.setBounds(80, 400, 100, 27);

        jrbHr.setBackground(new java.awt.Color(243, 246, 254));
        jrbHr.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jrbHr.setText("Company HR");
        jrbHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHrActionPerformed(evt);
            }
        });
        jPanel1.add(jrbHr);
        jrbHr.setBounds(180, 400, 140, 27);

        jrbUser.setBackground(new java.awt.Color(243, 246, 254));
        jrbUser.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jrbUser.setText("User");
        jPanel1.add(jrbUser);
        jrbUser.setBounds(320, 400, 90, 27);

        btnLogin.setBackground(new java.awt.Color(204, 204, 255));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(70, 480, 210, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton2.setText("Sign Up");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        jPanel1.add(jButton2);
        jButton2.setBounds(310, 480, 220, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\som\\Desktop\\tnp project images\\images\\transparent logo.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 170, 54);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\som\\Desktop\\tnp project images\\images\\homePage.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(900, 900));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 50, 580, 410);

        txtMail.setBackground(new java.awt.Color(172, 192, 234));
        txtMail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtMail);
        txtMail.setBounds(90, 200, 320, 30);

        txtpass.setBackground(new java.awt.Color(172, 192, 234));
        txtpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtpass);
        txtpass.setBounds(90, 290, 310, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\som\\Desktop\\tnp project images\\images\\TextFieldPic.png")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 190, 340, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\som\\Desktop\\tnp project images\\images\\TextFieldPic.png")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 280, 340, 50);

        jLabel8.setBackground(new java.awt.Color(243, 246, 254));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 350, 350, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbHrActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       if(validateInputs()==false){
           JOptionPane.showMessageDialog(null,"Please fill all the fields","Error!",JOptionPane.ERROR_MESSAGE);
          return;
       }
       String type=validateUser();
       if(type==null){
        JOptionPane.showMessageDialog(null,"Please select a user type","Error!",JOptionPane.ERROR_MESSAGE);
       return; 
    }//GEN-LAST:event_btnLoginActionPerformed
       UserPojo user=new UserPojo();
       user.setUserid(userId.toUpperCase());
       user.setPassword(password);
       user.setType(type);
       try{
           boolean result=userDAO.validateUser(user);
           if(result){
               if(CurrentUser.getType().equals("Admin")){
                   JOptionPane.showMessageDialog(null,"Welcome Admin" +CurrentUser.getName(),"Success",JOptionPane.INFORMATION_MESSAGE);
                   new AdminOptionFrame.setVisible(result);
                   this.dispose();
               }else if(CurrentUser.getType().equals("Admin")){
                   //code to open hr window
               }else{
                   //code to open student
               }
           }
           else {
               JOptionPane.showMessageDialog(null,"Invalid User","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
           }
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"DB Error","",JOptionPane.INFORMATION_MESSAGE);
           ex.printStackTrace();
       }
    }
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbAdmin;
    private javax.swing.JRadioButton jrbHr;
    private javax.swing.JRadioButton jrbUser;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables

   


    
    }

