/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorkAreaPanel;

import Business.Enterprise.Enterprise;
import Business.Organisation.BloodCollectionOrganization;
import Business.Organisation.BloodbankReceptionOrganization;
import Business.Organisation.DoctorOrganization;
import Business.Organisation.LabAssistantOrganization;
import Business.Organisation.LabReceptionOrganization;
import Business.Organisation.OrganInventoryCollectionOrganization;
import Business.Organisation.OrganInventoryReceptionOrganization;
import Business.Organisation.Organization;
import Business.Organisation.Organization.BloodBankType;
import Business.Organisation.Organization.LabType;
import Business.Organisation.Organization.OrganInventoryType;
import Business.Organisation.Organization.Type;
import Business.Organisation.OrganizationDirectory;
import Business.Organisation.ReceptionOrganization;
import Business.Role.ReceptionRole;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OrganizationDirectory directory;
    private Enterprise enterprise;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory directory, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise;

        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        organizationJComboBox.removeAllItems();

        if (enterprise.getEnterpriseType().getValue().equals("Hospital")) {

            for (Type type : Organization.Type.values()) {
                
                if (!type.getValue().equals(Type.Admin.getValue())) {
                    organizationJComboBox.addItem(type);
                }
                
                
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof DoctorOrganization && type.equals(Type.Doctor)){
                        organizationJComboBox.removeItem(type);
                    }
                    if(organization instanceof ReceptionOrganization && type.equals(Type.ReceptionHostpital)){
                        organizationJComboBox.removeItem(type);
                    }
                }
            }

        } else if (enterprise.getEnterpriseType().getValue().equals("BloodBank")) {
            for (BloodBankType Btype : Organization.BloodBankType.values()) {
                if (!Btype.getValue().equals(BloodBankType.Admin.getValue())) {
                    organizationJComboBox.addItem(Btype);
                }
                
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof BloodbankReceptionOrganization && Btype.equals(BloodBankType.ReceptionBloodBank)){
                        organizationJComboBox.removeItem(Btype);
                    }
                    if(organization instanceof BloodCollectionOrganization && Btype.equals(BloodBankType.Collection)){
                        organizationJComboBox.removeItem(Btype);
                    }
                }
            }
        }
        else if (enterprise.getEnterpriseType().getValue().equals("OrganInventory")){
            for (OrganInventoryType Otype :Organization.OrganInventoryType.values()){
                if (!Otype.getValue().equals(OrganInventoryType.Admin.getValue())) {
                    organizationJComboBox.addItem(Otype);
                }
                
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof OrganInventoryReceptionOrganization && Otype.equals(OrganInventoryType.ReceptionOrganInventory)){
                        organizationJComboBox.removeItem(Otype);
                    }
                    if(organization instanceof OrganInventoryCollectionOrganization && Otype.equals(OrganInventoryType.Inventory)){
                        organizationJComboBox.removeItem(Otype);
                    }
                }       
            }
        
        }
                else if (enterprise.getEnterpriseType().getValue().equals("PathLab")){
            for (LabType Ltype :Organization.LabType.values()){
                if (!Ltype.getValue().equals(LabType.Admin.getValue())) {
                    organizationJComboBox.addItem(Ltype);
                }
                
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof LabReceptionOrganization && Ltype.equals(LabType.ReceptionLab)){
                        organizationJComboBox.removeItem(Ltype);
                    }
                    if(organization instanceof LabAssistantOrganization  && Ltype.equals(LabType.LabAssistant)){
                        organizationJComboBox.removeItem(Ltype);
                    }
                }       
            }
        
        }
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : directory.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

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
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(222, 248, 248));
        setLayout(null);

        organizationJTable.setBackground(new java.awt.Color(225, 222, 222));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(90, 140, 490, 80);

        addJButton.setBackground(new java.awt.Color(153, 153, 153));
        addJButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addJButton.setForeground(new java.awt.Color(255, 255, 255));
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton);
        addJButton.setBounds(420, 360, 194, 39);

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(organizationJComboBox);
        organizationJComboBox.setBounds(330, 270, 160, 27);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Organization Type :");
        add(jLabel1);
        jLabel1.setBounds(140, 260, 190, 40);

        backJButton.setBackground(new java.awt.Color(153, 153, 153));
        backJButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(150, 360, 100, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("MANAGE ORGANIZATION");
        add(jLabel2);
        jLabel2.setBounds(70, 10, 530, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectModel/Healthcare (4).jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(-10, 0, 850, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        if (enterprise.getEnterpriseType().getValue().equals("Hospital")) {
            Type type = (Type) organizationJComboBox.getSelectedItem();
            directory.createOrganization(type);
            populateTable();
        } else if (enterprise.getEnterpriseType().getValue().equals("BloodBank")) {
            BloodBankType Btype = (BloodBankType) organizationJComboBox.getSelectedItem();
            directory.createBloodBankOrganization(Btype);
            populateTable();
        }
        else if (enterprise.getEnterpriseType().getValue().equals("OrganInventory")) {
            OrganInventoryType Otype = (OrganInventoryType) organizationJComboBox.getSelectedItem();
            directory.createOrganInventory(Otype);
            populateTable();
        }
        else if (enterprise.getEnterpriseType().getValue().equals("PathLab")) {
            LabType Ltype = (LabType) organizationJComboBox.getSelectedItem();
            directory.createLab(Ltype);
            populateTable();
        }
        populateCombo();

    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
