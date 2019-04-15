/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.PathLab.PathLab;
import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author puja_
 */
public class LabAssistantOrganization extends Organization{

    public LabAssistantOrganization() {
        //super(name);
        super(Organization.LabType.LabAssistant.getValue());
        this.assistantList = new ArrayList<>();
        
        
    }

    private ArrayList<PathLab> assistantList;

    public ArrayList<PathLab> getAssistantList() {
        return assistantList;
    }

    public void setAssistantList(ArrayList<PathLab> assistantList) {
        this.assistantList = assistantList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabAssistantRole());
        return roles;
    
}
}
