/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package userInterface;

import business.commclass;
import static java.awt.Frame.NORMAL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krishi
 */
public class Community extends javax.swing.JFrame {

   
    

    /**
     * Creates new form Community
     */
    public Community() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomm = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txthos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtzip = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtadd = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ziplbl = new javax.swing.JLabel();
        refreshbtn = new javax.swing.JButton();
        viewbtn1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tblcomm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Community Name", "Hospital", "Address", "Zipcode"
            }
        ));
        jScrollPane1.setViewportView(tblcomm);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(118, 93, 696, 167);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMMUNITY ADMIN ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(249, 12, 240, 28);

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn);
        updatebtn.setBounds(404, 295, 73, 23);

        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn);
        addbtn.setBounds(495, 295, 72, 23);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search by Zip");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(192, 55, 71, 16);

        txthos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthosActionPerformed(evt);
            }
        });
        getContentPane().add(txthos);
        txthos.setBounds(302, 559, 246, 22);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Community Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(159, 436, 99, 16);

        txtzip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtzipActionPerformed(evt);
            }
        });
        getContentPane().add(txtzip);
        txtzip.setBounds(302, 473, 246, 22);

        jLabel4.setText("Hospital");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(213, 562, 44, 16);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ENTER COMMUNITY DETAILS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(238, 382, 310, 33);

        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });
        getContentPane().add(txtadd);
        txtadd.setBounds(302, 519, 246, 22);

        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });
        getContentPane().add(cname);
        cname.setBounds(302, 433, 246, 22);

        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(215, 522, 42, 16);

        ziplbl.setForeground(new java.awt.Color(255, 255, 255));
        ziplbl.setText("Zipcode");
        getContentPane().add(ziplbl);
        ziplbl.setBounds(215, 476, 43, 16);

        refreshbtn.setText("REFRESH");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbtn);
        refreshbtn.setBounds(507, 52, 77, 23);

        viewbtn1.setText("VIEW");
        viewbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(viewbtn1);
        viewbtn1.setBounds(314, 295, 72, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(301, 52, 188, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Person = (DefaultTableModel) tblcomm.getModel();
        Person.setValueAt(cname.getText(),tblcomm.getSelectedRow(),0);
        Person.setValueAt(txthos.getText(),tblcomm.getSelectedRow(),1);
        Person.setValueAt(txtadd.getText(),tblcomm.getSelectedRow(),2);
        Person.setValueAt(txtzip.getText(),tblcomm.getSelectedRow(),3);
        
    }//GEN-LAST:event_updatebtnActionPerformed
                                         

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        
               String s1 = cname.getText();
               String s2= hos.getText();
               //String gen = (String) gender.getSelectedItem();
               //int t = Integer.parseInt(t1.getText());
               String s3= txtadd.getText();
               int z = txtzip.getText();
               
               
               
               tblcomm.setcname(s1);
               tblcomm.sethos(s2);
               tblcomm.setadd(s3);
               tblcomm.setzip(z);
               
               
               JOptionPane.showMessageDialog(this,"New Community added,");
               
               cname.setText("");
               zip.setText("");
               add.setText("");
               hos.setText("");
               t1.setText("");
               //gender.setSelectedItem("Select");
               //txtTeamInfo.setText("");
               //txtPosition.setText("");
               //txtEmail.setText("");
               //txtPhonenumber.setText("");
               
               
        
        
        
    }//GEN-LAST:event_addbtnActionPerformed

    private void txthosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthosActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void txtzipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtzipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtzipActionPerformed

    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        // TODO add your handling code here
       
        
        
        
       
        }
        
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void viewbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn1ActionPerformed
        // TODO add your handling code here:
        // if (selectedRowIndex<0){
          //   int selectedRowIndex = tblcomm.getSelectedRow();
            //JOptionPane.showMessageDialog(this, "Please select the row table", title, HEIGHT);
           // DefaultTableModel commtable = (DefaultTableModel)tblcomm.getModel();
            //tblcomm selectedInfo = (tblcomm)commtable.getValueAt(selectedRowIndex, NORMAL);
            
           // txtcname.setText(t:String.valueOf(selectedInfo.getCommuntiyName()));
           // txtzip.setText(t:String.valueOf(selectedInfo.getZipcode()));
           // txtadd.setText(t:String.valueOf(selectedInfo.getAddress()));
           // txthos.setText(t:String.valueOf(selectedInfo.getHospital()));
            
            
            
    }//GEN-LAST:event_viewbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Community.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Community.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Community.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Community.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Community().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField cname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JTable tblcomm;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txthos;
    private javax.swing.JTextField txtzip;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton viewbtn1;
    private javax.swing.JLabel ziplbl;
    // End of variables declaration//GEN-END:variables
}