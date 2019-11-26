
package maildetection;

/**
 *
 * @author saurabh
 */

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CreateMessage extends javax.swing.JFrame {
frmConnection frm=new frmConnection();
Statement st=null;
ResultSet rs=null;
String uname="";
    
    public CreateMessage(String uname) {
        initComponents();
        this.uname=uname;
        try
        {
            st=frm.getCon().createStatement();
            rs=st.executeQuery("select * from users where uname not in('admin','"+uname+"')");
            while(rs.next())
            {
                cmbUsers.addItem(rs.getString("uname").toString());
            }
        }
        catch(Exception ex)
        {
            
        }
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbUsers = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compose Message Module");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Create Message");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 20, 240, 24);

        jPanel2.setBackground(new java.awt.Color(240, 15, 38));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Message"));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setText("Message body");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 190, 120, 40);
        jPanel2.add(txtSubject);
        txtSubject.setBounds(200, 110, 370, 40);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setText("Select user");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 40, 110, 40);

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        jScrollPane1.setViewportView(txtMessage);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(80, 240, 490, 96);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submit_icon.jpg"))); // NOI18N
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(160, 370, 120, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.gif"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(330, 370, 120, 40);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setText("Subject");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 110, 110, 40);

        jPanel2.add(cmbUsers);
        cmbUsers.setBounds(220, 40, 350, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 60, 680, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(txtMessage.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Message Cann't Be Empty");
        }
        else if(txtSubject.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Subject Cann't Be Empty");
        }
        else
        {
            String status="";
        int found=0;
        ArrayList<String> tokens=new ArrayList<>();
        ArrayList<String> tokens2=new ArrayList<>();
        ArrayList<String> sus_words=new ArrayList<>();
        ArrayList<String> str1=new ArrayList<>();
 
 String str=txtSubject.getText().toLowerCase();
 String[] string=str.split(" ");

 for(String s:string)
 {
     
         str1.add(s);
     
 }
 
 
 str=txtMessage.getText().toLowerCase();
 string=str.split("\n");

 for(String para:string)
 {
     String[] string1=para.split(" ");
     for(String words:string1)
     {
         str1.add(words);
     }
 }
 
 

 try
 {
     st=frm.getCon().createStatement();
     rs=st.executeQuery("select * from dataset");
     while(rs.next())
     {

         String s=rs.getString("words").toLowerCase();
         sus_words.add(s);
     }

     for(String s1:str1)
     {

         for(String s:sus_words)
         {
             if((s1.equals(s)))
             {
                 found=1;
                 break;
             }

         }

         
         if(found==1)
         {
             break;
         }

     }

     if(found==1)
     {
         
         
         st.execute("insert into mails(sub,msg,touname,fromuname,status) values('"+txtSubject.getText()+"','"+txtMessage.getText()
                 +"','"+cmbUsers.getSelectedItem().toString()+"','"+uname+"','suspicious')");

     }
     else
     {
         st.execute("insert into mails(sub,msg,touname,fromuname,status) values('"+txtSubject.getText()+"','"+txtMessage.getText()
                 +"','"+cmbUsers.getSelectedItem().toString()+"','"+uname+"','normal')");
     }
     
     
            JOptionPane.showMessageDialog(rootPane,"Message is Successfully Sent to "+cmbUsers.getSelectedItem().toString());
            txtSubject.setText("");
            txtMessage.setText("");
        }
        catch(Exception ex){}
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
                new CreateMessage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbUsers;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables

}