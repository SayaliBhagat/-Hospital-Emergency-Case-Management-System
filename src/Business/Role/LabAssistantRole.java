/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organisation.LabAssistantOrganization;
import Business.Organisation.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.LabWorkAreaPanel.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author puja_
 */
public class LabAssistantRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, Enterprise enterprise) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, (LabAssistantOrganization)organization, business,enterprise);
    }
    
}
