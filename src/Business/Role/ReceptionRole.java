/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organisation.DoctorOrganization;
import Business.Organisation.Organization;
import Business.Organisation.ReceptionOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.ReceptionWorkAreaJpanel.ReceptionWorkareaJpanel;
import javax.swing.JPanel;

/**
 *
 * @author Mrunal
 */
public class ReceptionRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, Enterprise enterprise) {
        return new ReceptionWorkareaJpanel(userProcessContainer, account, (ReceptionOrganization)organization, enterprise);
    }
    
    
    
    
}
