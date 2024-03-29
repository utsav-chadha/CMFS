
package maildetection;

/**
 *
 * @author saurabh
 */

import javax.swing.JOptionPane;
import java.sql.*;

public class frmForget extends javax.swing.JFrame {
Statement st=null;
ResultSet rs=null;
frmConnection frm=new frmConnection();
    
    public frmForget() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbSecurity = new javax.swing.JComboBox();
        txtAnswer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forget Password Module");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Forget Password Panel"));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submit_icon.jpg"))); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(110, 280, 120, 40);
        jPanel1.add(txtUserName);
        txtUserName.setBounds(194, 93, 210, 30);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 100, 90, 19);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.gif"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(260, 280, 120, 40);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Forget Password Panel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 30, 240, 24);

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel9.setText("Security");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 150, 80, 19);

        cmbSecurity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Security Question", "What is Your Favorite Place?", "What is Your Favorite Food?", "What is Your Favorite Color?" }));
        jPanel1.add(cmbSecurity);
        cmbSecurity.setBounds(200, 140, 200, 30);
        jPanel1.add(txtAnswer);
        txtAnswer.setBounds(190, 180, 210, 30);

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel10.setText("Answer");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 190, 80, 19);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setText("New Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 230, 110, 19);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(190, 220, 210, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner_login_forgotpassword.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setText("forget password module");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go-back-icon.png"))); // NOI18N
        jButton3.setText("Back To Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton3)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtUserName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"User Name Field Cann't Be Empty");
        }
        else if(txtPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Password Field Cann't Be Empty");
        }
        else if(txtAnswer.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Answer Field Cann't Be Empty");
        }
        else if(cmbSecurity.getSelectedIndex()<=0)
        {
            JOptionPane.showMessageDialog(rootPane,"Security Question Be Selected ...");
        }
        else
        {
        try
        {
            st=frm.getCon().createStatement();
            rs=st.executeQuery("select * from users where uname='"+txtUserName.getText()+"' and ans='"+txtAnswer.getText()+"'");
            if(rs.next())
            {
                st.execute("update users set passw='"+txtPassword.getText()+"' where uname='"+txtUserName.getText()+"'");
                JOptionPane.showMessageDialog(rootPane,"Password is Successfully Changed");
            }
            else
        {
            JOptionPane.showMessageDialog(rootPane,"Wrong User Name or Security Answer .... Try Again");
            txtUserName.setText("");
            txtPassword.setText("");
            txtAnswer.setText("");
        }
        }
        catch(Exception ex)
        {
            System.out.println("Exception : "+ex.getMessage());
        }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
                new frmForget().setVisible(true);
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

}
