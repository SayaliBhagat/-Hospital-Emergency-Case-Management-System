/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Camp.Camp;
import Business.Role.BloodCollectionRole;
import Business.Role.BloodbankRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author puja_
 */
public class BloodCollectionOrganization extends Organization{
     public BloodCollectionOrganization(){
        super(Organization.BloodBankType.Collection.getValue());
        this.collectionList = new ArrayList<>();
    }
     
     private ArrayList<Camp> collectionList;

    public ArrayList<Camp> getCollectionList() {
        return collectionList;
    }

    public void setCollectionList(ArrayList<Camp> collectionList) {
        this.collectionList = collectionList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BloodCollectionRole());
        return roles;
    }

    
}
