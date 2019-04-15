/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorWorkAreaPanel;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organisation.DoctorOrganization;
import Business.Organisation.Organization;
import Business.UserAccount.UserAccount;
import Business.DoctorWorkQueue.WorkRequest;
import Business.DoctorWorkQueue.GetDoctorWorkRequest;
import Business.Enterprise.BloodBankEnterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.BloodBank;
import Business.Network.Network;
import Business.Organisation.BloodbankReceptionOrganization;
import Business.RequestBloodWorkQueue.RequestBloodFromDoctorWorkRequest;
import Business.RequestBloodWorkQueue.RequestBloodWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import UserInterface.DoctorWorkAreaPanel.ProcessingRequestByDoctorJPanel;
import UserInterface.DoctorWorkAreaPanel.Diagnosis;

/**
 *
 * @author sayalibhagat
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
   // private Business business;
    private UserAccount userAccount;
    private DoctorOrganization DoctorOrganization;
    //private Enterprise enterprise;
    private Business business;
    private Organization organization;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
         this.business = business;
        this.userAccount = account;
        this.organization = organization;
        this.DoctorOrganization = (DoctorOrganization)organization;
       // this.enterprise = enterprise;
       populateTable();
       
       
    }

   public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)doctorWorkAreaTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : DoctorOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getPatientAge();
            row[2] = request.getPatientGender();
            row[3] = request.getCastType();
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
           
            
            
            model.addRow(row);
        }
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
        doctorWorkAreaTable = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        sendDiagnosis = new javax.swing.JButton();

        setBackground(new java.awt.Color(222, 248, 248));

        doctorWorkAreaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Patient Age", "Patient Gender", "Case Type", "Sender", "Receiver", "Status", "Diagnosis"
            }
        ));
        jScrollPane1.setViewportView(doctorWorkAreaTable);

        assignBtn.setBackground(new java.awt.Color(0, 153, 153));
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("Assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        processBtn.setBackground(new java.awt.Color(0, 153, 153));
        processBtn.setForeground(new java.awt.Color(255, 255, 255));
        processBtn.setText("Process");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        sendDiagnosis.setBackground(new java.awt.Color(0, 153, 153));
        sendDiagnosis.setForeground(new java.awt.Color(255, 255, 255));
        sendDiagnosis.setText("Send Diagnosis");
        sendDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendDiagnosisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendDiagnosis)
                        .addGap(409, 409, 409)
                        .addComponent(processBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed

int selectedRow = doctorWorkAreaTable.getSelectedRow();
if(selectedRow < 0)
{
    return;
}

WorkRequest workRequest = (WorkRequest)doctorWorkAreaTable.getValueAt(selectedRow, 0);
workRequest.setReceiver(userAccount);
workRequest.setStatus("pending");
populateTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_assignBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed

int selectedRow = doctorWorkAreaTable.getSelectedRow();
if(selectedRow < 0)
    return;

GetDoctorWorkRequest request = (GetDoctorWorkRequest)doctorWorkAreaTable.getValueAt(selectedRow,0);
request.setStatus("processing");






//ProcessingRequestByDoctorJPanel
ProcessJPanel processWorkRequestJPanel = new ProcessJPanel(userProcessContainer, userAccount,request,business,organization);
        userProcessContainer.add("processingRequestByDoctorJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_processBtnActionPerformed

    private void sendDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendDiagnosisActionPerformed
        // TODO add your handling code here:
         int selectedRow = doctorWorkAreaTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        GetDoctorWorkRequest request = (GetDoctorWorkRequest)doctorWorkAreaTable.getValueAt(selectedRow, 0);
        
        
       Diagnosis  diagnosis = new Diagnosis(userProcessContainer, request);
        userProcessContainer.add("diagnosis", diagnosis);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_sendDiagnosisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JTable doctorWorkAreaTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processBtn;
    private javax.swing.JButton sendDiagnosis;
    // End of variables declaration//GEN-END:variables
}
