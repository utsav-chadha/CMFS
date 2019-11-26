
package maildetection;

/**
 *
 * @author saurabh
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class ShowMessage extends javax.swing.JFrame {
frmConnection frm=new frmConnection();
Statement st=null;
ResultSet rs=null;
String key1="";
int mid1;
    
    public ShowMessage(String sub,String msg,String from,String mid) {
        initComponents();
        this.mid1=Integer.parseInt(mid);
        try
        {
            st=frm.getCon().createStatement();
            
            rs=st.executeQuery("select * from mails where id="+mid1);
            if(rs.next())
            {
                if(rs.getString("key1").equals("0"))
                {
                    btnDecryptSubject.setVisible(false);
                    btnDecryptMessage.setVisible(false);
                }
                else
                {
                    btnDecryptSubject.setVisible(true);
                    btnDecryptMessage.setVisible(true);
                }
                txtFrom.setText(from);
                txtMessage.setText(msg);
                txtSubject.setText(sub);
            }
        }
        catch(Exception ex)
        {
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnDecryptMessage = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        btnDecryptSubject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compose Message Module");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Show Message Panel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 20, 240, 24);

        jPanel2.setBackground(new java.awt.Color(240, 15, 38));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Show Message Panel"));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setText("Message body");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 180, 120, 40);
        jPanel2.add(txtSubject);
        txtSubject.setBounds(150, 120, 370, 40);

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        jScrollPane1.setViewportView(txtMessage);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 230, 490, 96);

        btnDecryptMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forgot-password.png"))); // NOI18N
        btnDecryptMessage.setText("Decrypt");
        btnDecryptMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptMessageActionPerformed(evt);
            }
        });
        jPanel2.add(btnDecryptMessage);
        btnDecryptMessage.setBounds(540, 260, 120, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.gif"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(210, 370, 200, 50);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setText("subject");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 120, 100, 40);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setText("From user");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 60, 110, 40);
        jPanel2.add(txtFrom);
        txtFrom.setBounds(150, 60, 370, 40);

        btnDecryptSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forgot-password.png"))); // NOI18N
        btnDecryptSubject.setText("Decrypt");
        btnDecryptSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptSubjectActionPerformed(evt);
            }
        });
        jPanel2.add(btnDecryptSubject);
        btnDecryptSubject.setBounds(540, 120, 120, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 70, 680, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDecryptMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptMessageActionPerformed
        // TODO add your handling code here:
        key1= JOptionPane.showInputDialog(rootPane,"Input Key : ");
        try
        {
            st=frm.getCon().createStatement();
            rs=st.executeQuery("select * from mails where id="+mid1+" and key1='"+key1+"'");
            if(rs.next())
            {
                String msg = txtMessage.getText().toString();
                String decodedmsg = new TripleDES().decrypt(msg,key1);
                txtMessage.setText(decodedmsg);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Input Key Value is Wrong .... Try Again ....");
            }
        
        }
        catch(Exception ex){}
        
    }//GEN-LAST:event_btnDecryptMessageActionPerformed

    private void btnDecryptSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptSubjectActionPerformed
        // TODO add your handling code here:
        
        key1= JOptionPane.showInputDialog(rootPane,"Input Key : ");
        try
        {
            st=frm.getCon().createStatement();
            rs=st.executeQuery("select * from mails where id="+mid1+" and key1='"+key1+"'");
            if(rs.next())
            {
                 String sub = txtSubject.getText().toString();
                String decodedsub = new TripleDES().decrypt(sub,key1);
                txtSubject.setText(decodedsub);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Input Key Value is Wrong .... Try Again ....");
            }
        
        }
        catch(Exception ex){}
        
    }//GEN-LAST:event_btnDecryptSubjectActionPerformed

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
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecryptMessage;
    private javax.swing.JButton btnDecryptSubject;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables

}
