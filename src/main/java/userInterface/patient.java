/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface;

import static java.util.Locale.filter;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;








/**
 *
 * @author Krishi
 */
public class patient extends javax.swing.JFrame {

    /**
     * Creates new form patient
     */
    
    public patient() {
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

        jLabel1 = new javax.swing.JLabel();
        search1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablesd = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Community");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(295, 81, 64, 16);

        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });
        getContentPane().add(search1);
        search1.setBounds(392, 78, 204, 22);

        tablesd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Hospital Name", "Community", "Zipcode", "City"
            }
        ));
        jScrollPane1.setViewportView(tablesd);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(142, 131, 591, 388);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SEARCH DOCTORS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(361, 32, 111, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Krishi\\Desktop\\Data\\image1.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-5, -3, 980, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tablesd.getModel();
        String value = search1.getText();
        TableRowSorter<DefaultTableModel> key = new TableRowSorter<DefaultTableModel>(model);
        tablesd.setRowSorter(key);
        key.setRowFilter(RowFilter.regexFilter(value));
        
    }//GEN-LAST:event_search1KeyReleased

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
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search1;
    private javax.swing.JTable tablesd;
    // End of variables declaration//GEN-END:variables

 private void populateTable(){
                DefaultTableModel model = (DefaultTableModel)tablesd.getModel();
                model.setRowCount(0);
                
                             
                for (Doctor d: d.getD())
                {
                    
                }
            
        }

}