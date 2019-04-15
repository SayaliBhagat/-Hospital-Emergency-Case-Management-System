/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Mrunal
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        TestLab("Test Lab"),
        Bloodbank("Blood Bank"),
        Organ("Organ Bank");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
}
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business,Enterprise enterprise);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}