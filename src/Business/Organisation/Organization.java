/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.DoctorWorkQueue.WorkQueue;
import Business.LabWorkQueueArea.RequestLabWorkQueue;
import Business.OrganWorkQueue.GetOrganWorkQueue;
import Business.WorkQueue.GetBloodFromCollectionWorkQueue;
import Business.RequestBloodWorkQueue.ReceiveRequestFromDoctorWorkQueue;
import Business.RequestOrganByDoctorWorkArea.ReceiveOrganRequestFromDoctorWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author sayalibhagat
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private GetBloodFromCollectionWorkQueue getBloodFromCollection;
    private GetOrganWorkQueue getOrganFromInventory;
    private ReceiveRequestFromDoctorWorkQueue receiverRequestFromDoctor;
    private ReceiveOrganRequestFromDoctorWorkQueue receiveOrganRequestFromDoctor;

    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;

    private RequestLabWorkQueue receiveLabRequest;



    public GetBloodFromCollectionWorkQueue getGetBloodFromCollection() {
        return getBloodFromCollection;
    }

    public void setGetBloodFromCollection(GetBloodFromCollectionWorkQueue getBloodFromCollection) {
        this.getBloodFromCollection = getBloodFromCollection;
    }

    
    public GetOrganWorkQueue getGetOrganFromInventory() {
        return getOrganFromInventory;
    }

    public void setGetOrganFromInventory(GetOrganWorkQueue getOrganFromInventory) {
        this.getOrganFromInventory = getOrganFromInventory;
    }
    
    
    
    public enum Type{
        Admin("Admin Organization"), 
        Doctor("Doctor Organization"),
        ReceptionHostpital("Reception Organization"); 

        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum LabTestType{
        Admin("Admin Organization"),
        ReceptionLab("Reception Organization"),
        LabTest("Lab Test Organization");
    
    private String value;
        private LabTestType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum BloodBankType{
    Admin("Admin Organization"),
    ReceptionBloodBank("Reception Organization"),
    Collection("Blood Collection Organization");
    
    
    private String value;
        private BloodBankType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum OrganInventoryType{
        Admin ("Admin Organization"),
        ReceptionOrganInventory ("Reception Organization"),
        Inventory ("Organ Inventory Organization");
        
        private String value;
        private OrganInventoryType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        }
        
        
       public enum LabType{
        Admin ("Admin Organization"),
        ReceptionLab ("Reception Organization"),
        LabAssistant ("Lab Assistant Organization");
        
        private String value;
        private LabType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
           
       } 
        
    

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        getBloodFromCollection = new GetBloodFromCollectionWorkQueue();
        receiverRequestFromDoctor = new ReceiveRequestFromDoctorWorkQueue();
        receiveOrganRequestFromDoctor = new ReceiveOrganRequestFromDoctorWorkQueue();
        getOrganFromInventory = new GetOrganWorkQueue();
         receiveLabRequest = new RequestLabWorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    


    public ReceiveRequestFromDoctorWorkQueue getReceiverRequestFromDoctor() {
        return receiverRequestFromDoctor;
    }

    public void setReceiverRequestFromDoctor(ReceiveRequestFromDoctorWorkQueue receiverRequestFromDoctor) {
        this.receiverRequestFromDoctor = receiverRequestFromDoctor;
    }
    
    public ReceiveOrganRequestFromDoctorWorkQueue getReceiveOrganRequestFromDoctor() {
        return receiveOrganRequestFromDoctor;
    }

    public void setReceiveOrganRequestFromDoctor(ReceiveOrganRequestFromDoctorWorkQueue receiveOrganRequestFromDoctor) {
        this.receiveOrganRequestFromDoctor = receiveOrganRequestFromDoctor;
    }

    public RequestLabWorkQueue getReceiveLabRequest() {
        return receiveLabRequest;
    }

    public void setReceiveLabRequest(RequestLabWorkQueue receiveLabRequest) {
        this.receiveLabRequest = receiveLabRequest;
    }

    
    
    


    @Override
    public String toString() {
        return name;
    }
    
}
