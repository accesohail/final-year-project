/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class SKIN_SPECIALIST extends javax.swing.JFrame {
     Connection con=null;
 Statement st=null;
 ResultSet rs=null;
 boolean update=true,field=false;
 

    /**
     * Creates new form SKIN
     */
    public SKIN_SPECIALIST() {
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

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        jLabel3 = new javax.swing.JLabel();
        textArea2 = new java.awt.TextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(990, 700));
        getContentPane().setLayout(null);

        label1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        label1.setText("SKIN SPECIALIST");
        getContentPane().add(label1);
        label1.setBounds(274, 35, 315, 47);

        label2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label2.setText("DR.JHON");
        getContentPane().add(label2);
        label2.setBounds(373, 83, 114, 33);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/skin.jpg"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(670, 0, 246, 245);

        jButton1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 590, 100, 31);

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel2.setText("DISEASE DESCRIPTION");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(66, 260, 208, 22);
        getContentPane().add(textArea1);
        textArea1.setBounds(66, 292, 359, 142);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setText("MEDICATIONS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(66, 444, 132, 22);
        getContentPane().add(textArea2);
        textArea2.setBounds(66, 476, 359, 140);

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel4.setText("Patient Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(413, 140, 104, 22);

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel5.setText("Patient ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(92, 145, 89, 22);

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel7.setText("Patient Sex");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(413, 172, 100, 22);

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel6.setText("Patient Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(92, 175, 120, 22);

        label4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label4);
        label4.setBounds(222, 177, 105, 20);

        label5.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label5);
        label5.setBounds(527, 142, 92, 20);

        label6.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label6);
        label6.setBounds(527, 174, 92, 20);

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel8.setText("Patient Disease");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(449, 292, 137, 22);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 140, 110, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(640, 290, 120, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(620, 590, 120, 30);

        jButton2.setText("Show history");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 590, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                Connection con=null;
 PreparedStatement st=null;
 ResultSet rs=null;
if(jTextField5.getText().isEmpty()&&textArea1.getText().isEmpty()&&textArea2.getText().isEmpty()){
                  update=false;
              }
             database db= new database();
       int id=0, fee=0;
       if(update&&field){
     try{
          
     
       con=db.createdatabase();
       st=con.prepareStatement("update PATIENT SET disease ='"+jTextField5.getText()+"', description='"+textArea1.getText()+"',medication='"+textArea2.getText()+"' where id='"+jTextField1.getText()+"' ");
      st.execute();
             JOptionPane.showMessageDialog(this,"Patient updated  successfully");  
               jTextField5.setText("");
            jTextField1.setText("");
       textArea1.setText("");
         textArea2.setText("");
         label4.setText("");
          label5.setText("");
          label6.setText("");
             
       
     }
     catch (SQLException e )
     {
       JOptionPane.showMessageDialog(this,e);
     }
       }
       else
            JOptionPane.showMessageDialog(this,"please fill all the fields");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
                    database db= new database();
      String id="";
      boolean login =false;
     try{
     field=true;
       con=db.createdatabase();
      st=con.createStatement();
     rs=st.executeQuery("select * from PATIENT where id='"+jTextField1.getText()+"' ");
       while(rs.next()){
         id= jTextField1.getText();
          label4.setText(rs.getString("NAME"));
          label5.setText(rs.getString("AGE"));
          label6.setText(rs.getString("SEX"));
      }
    }
    catch (SQLException e ) 
        
     {
           JOptionPane.showMessageDialog(this,e); 
         
     }  
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   this.hide();
       login l=new login();
       l.show();
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        history h= new history("s");
        h.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SKIN_SPECIALIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SKIN_SPECIALIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SKIN_SPECIALIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SKIN_SPECIALIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SKIN_SPECIALIST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}