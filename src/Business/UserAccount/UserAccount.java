/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.DoctorWorkQueue.WorkQueue;
import Business.LabWorkQueueArea.RequestLabWorkQueue;
import Business.OrganWorkQueue.GetOrganWorkQueue;
import Business.RequestBloodWorkQueue.ReceiveRequestFromDoctorWorkQueue;
import Business.RequestOrganByDoctorWorkArea.ReceiveOrganRequestFromDoctorWorkQueue;
import Business.WorkQueue.GetBloodFromCollectionWorkQueue;


/**
 *
 * @author Mrunal
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private GetBloodFromCollectionWorkQueue receiverRequestFromBloodBank;
    private ReceiveRequestFromDoctorWorkQueue receiverRequestFromDoctor;
    private ReceiveOrganRequestFromDoctorWorkQueue receiveOrganRequestFromDoctor;
    private GetOrganWorkQueue receiveRequestFromOrganInventory;

    private RequestLabWorkQueue receiveLabWorkQueue;

    public ReceiveRequestFromDoctorWorkQueue getReceiverRequestFromDoctor() {
        return receiverRequestFromDoctor;
    }

    public void setReceiverRequestFromDoctor(ReceiveRequestFromDoctorWorkQueue receiverRequestFromDoctor) {
        this.receiverRequestFromDoctor = receiverRequestFromDoctor;
    }

    public GetBloodFromCollectionWorkQueue getReceiverRequestFromBloodBank() {
        return receiverRequestFromBloodBank;
    }

    public void setReceiverRequestFromBloodBank(GetBloodFromCollectionWorkQueue receiverRequestFromBloodBank) {
        this.receiverRequestFromBloodBank = receiverRequestFromBloodBank;
    }


    public ReceiveOrganRequestFromDoctorWorkQueue getReceiveOrganRequestFromDoctor() {
        return receiveOrganRequestFromDoctor;
    }

    public void setReceiveOrganRequestFromDoctor(ReceiveOrganRequestFromDoctorWorkQueue receiveOrganRequestFromDoctor) {
        this.receiveOrganRequestFromDoctor = receiveOrganRequestFromDoctor;
    }

    public GetOrganWorkQueue getReceiveRequestFromOrganInventory() {
        return receiveRequestFromOrganInventory;
    }

    public void setReceiveRequestFromOrganInventory(GetOrganWorkQueue receiveRequestFromOrganInventory) {
        this.receiveRequestFromOrganInventory = receiveRequestFromOrganInventory;
    }

    public RequestLabWorkQueue getReceiveLabWorkQueue() {
        return receiveLabWorkQueue;
    }

    public void setReceiveLabWorkQueue(RequestLabWorkQueue receiveLabWorkQueue) {
        this.receiveLabWorkQueue = receiveLabWorkQueue;
    }


    public UserAccount() {
        workQueue = new WorkQueue();
        receiverRequestFromDoctor = new ReceiveRequestFromDoctorWorkQueue();
        receiverRequestFromBloodBank = new GetBloodFromCollectionWorkQueue();
        receiveRequestFromOrganInventory = new GetOrganWorkQueue();
        receiveOrganRequestFromDoctor = new ReceiveOrganRequestFromDoctorWorkQueue();

        receiveLabWorkQueue = new RequestLabWorkQueue();

    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
    
}
