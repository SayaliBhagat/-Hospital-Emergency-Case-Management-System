/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Organ.Organ;
import Business.Role.OrganInventoryRole;
import Business.Role.Role;
import Business.Role.OrganReceptionRole;
import java.util.ArrayList;

/**
 *
 * @author puja_
 */
public class OrganInventoryCollectionOrganization extends Organization{

    public OrganInventoryCollectionOrganization() {
        super(Organization.OrganInventoryType.Inventory.getValue());
        this.inventoryList = new ArrayList<>();
    }
     
     private ArrayList<Organ> inventoryList;
     
    public ArrayList<Organ> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Organ> inventoryList) {
        this.inventoryList = inventoryList;
    }


  @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new OrganInventoryRole());
        return roles;
    }


    
}
