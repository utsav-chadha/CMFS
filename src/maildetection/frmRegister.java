
package maildetection;

/**
 *
 * @author saurabh
 */

import javax.swing.JOptionPane;
import java.sql.*;

public class frmRegister extends javax.swing.JFrame {
Statement st=null;
ResultSet rs=null;
frmConnection frm=new frmConnection();
    public frmRegister() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        cmbSecurity = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Module");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registration Panel"));
        jPanel1.setLayout(null);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(200, 130, 210, 30);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 140, 80, 19);
        jPanel1.add(txtUserName);
        txtUserName.setBounds(200, 90, 210, 30);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 100, 90, 19);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.gif"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(270, 390, 130, 40);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Registration Panel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 30, 185, 24);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register_icon.jpg"))); // NOI18N
        jButton3.setText("Register");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(80, 390, 143, 39);

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 220, 80, 19);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 180, 80, 19);
        jPanel1.add(txtAddress);
        txtAddress.setBounds(200, 170, 210, 30);
        jPanel1.add(txtEmail);
        txtEmail.setBounds(200, 210, 210, 30);

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel8.setText("mobile");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 260, 80, 19);
        jPanel1.add(txtMobile);
        txtMobile.setBounds(200, 250, 210, 30);

        cmbSecurity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Security Question", "What is Your Favorite Place?", "What is Your Favorite Food?", "What is Your Favorite Color?" }));
        jPanel1.add(cmbSecurity);
        cmbSecurity.setBounds(200, 290, 210, 30);

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel9.setText("Security");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 300, 80, 19);

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel10.setText("Answer");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 340, 80, 19);
        jPanel1.add(txtAnswer);
        txtAnswer.setBounds(200, 330, 210, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1157387359XcR2T8.gif"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setText("Suspicious mail detection");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go-back-icon.png"))); // NOI18N
        jButton1.setText("Back To Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(txtUserName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"User Name Field Cann't Be Empty");
        }
        else if(txtPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Password Field Cann't Be Empty");
        }
        else if(txtAddress.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Address Field Cann't Be Empty");
        }
        else if(txtEmail.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Email Field Cann't Be Empty");
        }
        else if(txtMobile.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Mobile Field Cann't Be Empty");
        }
        else if(cmbSecurity.getSelectedIndex()<=0)
        {
            JOptionPane.showMessageDialog(rootPane,"Please Select Security Question ...");
        }
        else if(txtAnswer.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Answer Field Cann't Be Empty");
        }
        else if(txtMobile.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(rootPane,"Mobile Number Should be Equals To Ten Digit");
        }
        else
        {
            
        
         try
        {
            st=frm.getCon().createStatement();
            rs=st.executeQuery("select * from users where uname='"+txtUserName.getText()+"'");
            if(rs.next())
            {
                JOptionPane.showMessageDialog(rootPane,"User name is already Registered ... Try Again");
                txtUserName.setText("");
            }
            else
            {
                st.execute("insert into users(uname,passw,addr,email,mobile,ans) values('"+txtUserName.getText()+"','"
                    +txtPassword.getText()+"','"+txtAddress.getText()+"','"+txtEmail.getText()+"','"+txtMobile.getText()+"','"+txtAnswer.getText()+"')");
            
            
            JOptionPane.showMessageDialog(rootPane,"You are Registered Successfully");
            txtAddress.setText("");
            txtEmail.setText("");
            txtMobile.setText("");
            txtPassword.setText("");
            txtUserName.setText("");
            txtAnswer.setText("");
            }
            frm.closeCon();
            
            
        }
        catch(Exception ex)
        {
            System.out.println("Exception : "+ex.getMessage());
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
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
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbSecurity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

}
