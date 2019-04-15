/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organisation.OrganInventoryReceptionOrganization;
import Business.Organisation.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.OrganInventoryWorkAreaPanel.OrganReceptionWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author puja_
 */
public class OrganReceptionRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, Enterprise enterprise) {
       return new OrganReceptionWorkAreaJPanel(userProcessContainer, account, (OrganInventoryReceptionOrganization)organization, enterprise, business);
    }
    
}
