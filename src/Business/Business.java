/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organisation.Organization;
import Business.Organisation.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Mrunal
 */
public class Business extends Organization{

   private static Business business;
    private ArrayList<Network> networkList;
    public static Business getInstance(){
        if(business==null){
            business=new Business();
        }
        return business;
    }

    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private Business(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
}
