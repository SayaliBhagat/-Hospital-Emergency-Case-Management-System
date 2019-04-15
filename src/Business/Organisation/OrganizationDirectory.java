/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Organisation.Organization.BloodBankType;
import Business.Organisation.Organization.OrganInventoryType;
import Business.Organisation.Organization.LabType;

import Business.Organisation.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author sayalibhagat
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ReceptionHostpital.getValue())){
            organization = new ReceptionOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
    
    public Organization createBloodBankOrganization(BloodBankType bloodBankType)
    {
         Organization organization = null;
        if (bloodBankType.getValue().equals(bloodBankType.ReceptionBloodBank.getValue())){
            organization = new BloodbankReceptionOrganization();
            organizationList.add(organization);
        }
        else if (bloodBankType.getValue().equals(bloodBankType.Collection.getValue())){
            organization = new BloodCollectionOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }

    
        public Organization createOrganInventory(OrganInventoryType organinventoryType)
    {
         Organization organization = null;
        if (organinventoryType.getValue().equals(organinventoryType.ReceptionOrganInventory.getValue())){
            organization = new OrganInventoryReceptionOrganization();
            organizationList.add(organization);
        }
        else if (organinventoryType.getValue().equals(organinventoryType.Inventory.getValue())){
            organization = new OrganInventoryCollectionOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }

         public Organization createLab(LabType labType)
    {
         Organization organization = null;
        if (labType.getValue().equals(labType.ReceptionLab.getValue())){
            organization = new LabReceptionOrganization();
            organizationList.add(organization);
        }
        else if (labType.getValue().equals(labType.LabAssistant.getValue())){
            organization = new LabAssistantOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }

}
