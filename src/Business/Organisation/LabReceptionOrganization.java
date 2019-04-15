/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.LabReceptionRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author puja_
 */
public class LabReceptionOrganization extends Organization{

    public LabReceptionOrganization() {
        super(Organization.LabType.ReceptionLab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabReceptionRole());
        return roles;
    }





    
}
