/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
//import Business.Organisation.OrganOrganization;
import Business.Organisation.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
//import static java.time.Clock.system;
import javax.swing.JPanel;

/**
 *
 * @author sayalibhagat
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business,Enterprise enterprise) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer,business ); //To change body of generated methods, choose Tools | Templates.
    }
}
