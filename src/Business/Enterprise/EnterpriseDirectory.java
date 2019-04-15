/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;
import Business.Organisation.OrganizationDirectory;

/**
 *
 * @author Mrunal
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.BloodBank )
        {
            enterprise=new BloodBankEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.OrganInventory )
        {
            enterprise=new OrganInventoryEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.Lab )
        {
            enterprise=new LabEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}
