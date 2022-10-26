/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.PatientVitalSign;

import business.Person;
import business.PersonDirectory;
import business.VitalSign;
import business.VitalSignDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.Person.CreatePatientVitalSIgnJPanel;
import userInterface.Person.ViewUpdateVitalSignsJPanel;

/**
 *
 * @author kinjal
 */
public class ManagePatientVitalSignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientVitalSignJPanel
     */
    
    
    private Person person;
    private PersonDirectory personDirectory;
    private JPanel userContainer;
    
    public ManagePatientVitalSignJPanel(JPanel userContainer,PersonDirectory personDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.userContainer = userContainer;
        populatePersonTable(personDirectory.getPersonDirectory());
    
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
        viewPatientDetailsTable = new javax.swing.JTable();
        lblMngPersonTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSearchPersonName = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnAddVitalSign = new javax.swing.JButton();
        btnDisplayVitalSignStatus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewPatientVitalDetailsTable = new javax.swing.JTable();
        btnViewVitalSign = new javax.swing.JButton();
        tbnDeleteVitalSign = new javax.swing.JButton();
        tbnUpdateVitalSign = new javax.swing.JButton();
        btnAbnormalVitalSign = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCountVitalSign = new javax.swing.JTextField();

        viewPatientDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Person Name", "Age", "Gender", "Patient Id", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewPatientDetailsTable);

        lblMngPersonTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMngPersonTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMngPersonTitle.setText("Manage Patient's Vital Signs");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Search:");

        txtSearchPersonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPersonNameActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAddVitalSign.setText("Add Vital Signs");
        btnAddVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalSignActionPerformed(evt);
            }
        });

        btnDisplayVitalSignStatus.setText("Display Patients Vital Sign Status");
        btnDisplayVitalSignStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayVitalSignStatusActionPerformed(evt);
            }
        });

        viewPatientVitalDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Timestamp", "Status", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(viewPatientVitalDetailsTable);

        btnViewVitalSign.setText("View Vital Sign");
        btnViewVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalSignActionPerformed(evt);
            }
        });

        tbnDeleteVitalSign.setText("Delete Vital Sign");

        tbnUpdateVitalSign.setText("Update Vital Sign");
        tbnUpdateVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnUpdateVitalSignActionPerformed(evt);
            }
        });

        btnAbnormalVitalSign.setText("Count Abnormal Vital Sign");
        btnAbnormalVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalVitalSignActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter community to find the count of Abnormal Cases :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtSearchPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(305, 305, 305)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAddVitalSign)
                                    .addGap(71, 71, 71)
                                    .addComponent(btnDisplayVitalSignStatus))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(310, 310, 310)
                                    .addComponent(tbnDeleteVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tbnUpdateVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(302, 302, 302)
                                    .addComponent(btnAbnormalVitalSign)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCountVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnViewVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(lblMngPersonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(396, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMngPersonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDisplayVitalSignStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnDeleteVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnUpdateVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCountVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbnormalVitalSign, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchPersonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPersonNameActionPerformed
        // TODO add your handling code here:

        String key= txtSearchPersonName.getText();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Person> searchPersons;
        searchPersons=personDirectory.searchPerson(key);
        populatePersonTable(searchPersons);
    }//GEN-LAST:event_txtSearchPersonNameActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:

        populatePersonTable(personDirectory.getPersonDirectory());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAddVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalSignActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = viewPatientDetailsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person = (Person) viewPatientDetailsTable.getValueAt(selectedRow, 0);
        
        //JOptionPane.showMessageDialog(userContainer, person.getPersonId());
        //Patient patient= person.getPatient();
        if(person!=null)
        {
            CreatePatientVitalSIgnJPanel createPatientVitalSIgnJPanel = new CreatePatientVitalSIgnJPanel(userContainer, person);
            userContainer.add("createPatientVitalSIgnJPanel", createPatientVitalSIgnJPanel);
            CardLayout layout = (CardLayout) userContainer.getLayout();
            layout.next(userContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, Please create"
                    + " Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddVitalSignActionPerformed

    private void btnViewVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalSignActionPerformed
            // TODO add your handling code here:
            
        int selectedRow = viewPatientVitalDetailsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VitalSign vitalSign = (VitalSign) viewPatientVitalDetailsTable.getValueAt(selectedRow, 0);
        ViewUpdateVitalSignsJPanel viewUpdateVitalSignsJPanel = new ViewUpdateVitalSignsJPanel(userContainer,
                vitalSign, Boolean.FALSE);
        userContainer.add("viewUpdateVitalSignsJPanel", viewUpdateVitalSignsJPanel);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.next(userContainer);
    }//GEN-LAST:event_btnViewVitalSignActionPerformed

    private void btnDisplayVitalSignStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayVitalSignStatusActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = viewPatientDetailsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person = (Person) viewPatientDetailsTable.getValueAt(selectedRow, 0);
        
        if(person!=null)
        {
            populateVitalSignTable(person);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, Please create "
                    + "Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDisplayVitalSignStatusActionPerformed

    private void tbnUpdateVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnUpdateVitalSignActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = viewPatientVitalDetailsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VitalSign vitalSign = (VitalSign) viewPatientVitalDetailsTable.getValueAt(selectedRow, 0);
        
        ViewUpdateVitalSignsJPanel viewUpdateVitalSignsJPanel = new ViewUpdateVitalSignsJPanel(userContainer,
                vitalSign, Boolean.TRUE);
        userContainer.add("vuvsJPanel", viewUpdateVitalSignsJPanel);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.next(userContainer);
    }//GEN-LAST:event_tbnUpdateVitalSignActionPerformed

    private void btnAbnormalVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalVitalSignActionPerformed
        // TODO add your handling code here:
        List<Person> peopleInGivenCommunity;
        peopleInGivenCommunity = personDirectory
        .getPersonDirectory().stream()
        .filter(p -> p.getCommunity().equals(jTextField1.getText()))
        .collect(Collectors.toList());
        int abnormalCount = 0;
        for(Person person: peopleInGivenCommunity){
            VitalSignDirectory vitalSignDirectory = person.getVitalSign();
            List<VitalSign> vitalSignLogs = vitalSignDirectory
            .getVitalSignDirectory();
            Collections.sort(vitalSignLogs, (a,b) -> b.getTimestamp()
                .compareTo(a.getTimestamp()));
            if(!vitalSignLogs.isEmpty()){
                VitalSign vSign = vitalSignLogs.get(0);
                String healthStatus = VitalSignStatus(person.getAge(),vSign);
                if(healthStatus.equals("Abnormal")){
                    abnormalCount++;
                }
            }

        }
        
        txtCountVitalSign.setText(String.valueOf(abnormalCount));
    }//GEN-LAST:event_btnAbnormalVitalSignActionPerformed

    private void populatePersonTable(ArrayList<Person> personsList) {
        DefaultTableModel model = (DefaultTableModel) viewPatientDetailsTable.getModel();
        model.setRowCount(0);
        if(personsList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Person's found. Please add"
                    + " Person's", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personsList) {
            Object[] row = new Object[5];
            row[0] = person;
            row[1]= person.getAge();
            row[2]= person.getGender();
            row[3]= person.getPersonId();
            row[4]=person.getCommunity();
           
            model.addRow(row);
        }
    }
    
    
    private void populateVitalSignTable(Person person) {
        
        DefaultTableModel model = (DefaultTableModel) viewPatientVitalDetailsTable.getModel();
        model.setRowCount(0);
        if (person != null) {
            int patientAge = person.getAge();
            ArrayList<VitalSign> vitalSignList = person.getVitalSign().getVitalSignDirectory();
            
            if (vitalSignList.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No vital signs found. Please"
                        + " add vital signs", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            for (VitalSign vitalSign : vitalSignList) {
                Object[] row = new Object[3];
                row[0] = vitalSign;
                row[1] = VitalSignStatus(patientAge, vitalSign);
                row[2] =  person.getCommunity();
                model.addRow(row);
            }
        }
    }
    
//    private void populateAllVitalSigns() {
//        DefaultTableModel model = (DefaultTableModel) viewPatientVitalDetailsTable.getModel();
//        model.setRowCount(0);
//        ArrayList<VitalSign> vitalSignList = person.getVitalSign().getVitalSignDirectory();
//        JOptionPane.showMessageDialog(userContainer, vitalSignList);
//        int patientAge = person.getAge();
//        for (VitalSign vitalSign : vitalSignList) {
//              Object[] row = new Object[3];
//                row[0] = vitalSign;
//                row[1] = VitalSignStatus(patientAge, vitalSign);
//                row[2] =  person.getCommunity();
//                model.addRow(row);
//        }
//    }
//    
    
    private String VitalSignStatus(int patientAge, VitalSign vitalSign) {
        String vitalSignStatus = "Normal";
        
        double respirationRate = vitalSign.getRespiratoryRate();
        double heartRate = vitalSign.getHeartRate();
        double bloodPressure = vitalSign.getBloodPressure();
        double weight = vitalSign.getWeight();
        
        /*Toddler*/
        if (patientAge >= 1 && patientAge <= 3) {
            if ((respirationRate < 20 || respirationRate > 30) /*Respiration Rate*/
                    || (heartRate < 80 || heartRate > 130) /*Heart Rate*/
                    || (bloodPressure < 80 || bloodPressure > 110) /*Blood Pressure*/
                    || (weight < 22 || weight > 31)) /*Weight*/ {
                vitalSignStatus = "Abnormal";
            }
        }
        /*Preschooler*/
        if (patientAge >= 4 && patientAge <= 5) {
            if ((respirationRate < 20 || respirationRate > 30)
                    || (heartRate < 80 || heartRate > 120)
                    || (bloodPressure < 80 || bloodPressure > 110)
                    || (weight < 31 || weight > 40)) {
                vitalSignStatus = "Abnormal";
            }
        }
        /*School Age*/
        if (patientAge >= 6 && patientAge <= 12) {
            if ((respirationRate < 20 || respirationRate > 30)
                    || (heartRate < 70 || heartRate > 110)
                    || (bloodPressure < 80 || bloodPressure > 120)
                    || (weight < 41 || weight > 92)) {
                vitalSignStatus = "Abnormal";
            }
        }
        /*Adolescent*/
        if (patientAge >= 13) {
            if ((respirationRate < 12 || respirationRate > 20)
                    || (heartRate < 55 || heartRate > 105)
                    || (bloodPressure < 110 || bloodPressure > 120)
                    || (weight < 110)) {
                vitalSignStatus = "Abnormal";
            }
        }
        return vitalSignStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbnormalVitalSign;
    private javax.swing.JButton btnAddVitalSign;
    private javax.swing.JButton btnDisplayVitalSignStatus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewVitalSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblMngPersonTitle;
    private javax.swing.JButton tbnDeleteVitalSign;
    private javax.swing.JButton tbnUpdateVitalSign;
    private javax.swing.JTextField txtCountVitalSign;
    private javax.swing.JTextField txtSearchPersonName;
    private javax.swing.JTable viewPatientDetailsTable;
    private javax.swing.JTable viewPatientVitalDetailsTable;
    // End of variables declaration//GEN-END:variables

    
}