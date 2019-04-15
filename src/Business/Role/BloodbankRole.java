/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organisation.BloodbankReceptionOrganization;
import Business.Organisation.DoctorOrganization;
import Business.Organisation.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.BloodReceptionWorkAreaJPanel.BloodReceptionWorkAreaJPanel;
import UserInterface.DoctorWorkAreaPanel.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sayalibhagat
 */
public class BloodbankRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business,Enterprise enterprise) {
        return new BloodReceptionWorkAreaJPanel(userProcessContainer, account, organization, enterprise,business);
    }
}
