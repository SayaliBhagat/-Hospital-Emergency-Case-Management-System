/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;


import Business.Role.BloodbankRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sayalibhagat
 */
public class BloodbankReceptionOrganization extends Organization {
    
    public BloodbankReceptionOrganization(){
        super(Organization.BloodBankType.ReceptionBloodBank.getValue());
    }
 @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BloodbankRole());
        return roles;
    }
    
}
