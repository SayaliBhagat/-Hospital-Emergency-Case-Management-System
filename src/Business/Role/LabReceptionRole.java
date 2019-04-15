/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organisation.LabReceptionOrganization;
import Business.Organisation.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.LabWorkAreaPanel.LabReceptionWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author puja_
 */
public class LabReceptionRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, Enterprise enterprise) {
        return new LabReceptionWorkAreaJPanel(userProcessContainer, account, (LabReceptionOrganization)organization, enterprise,business);
    }
    
}
