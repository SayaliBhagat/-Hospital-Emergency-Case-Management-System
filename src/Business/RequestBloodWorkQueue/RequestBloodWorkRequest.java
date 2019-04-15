/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestBloodWorkQueue;

import Business.DoctorWorkQueue.GetDoctorWorkRequest;
import Business.UserAccount.UserAccount;
import java.util.UUID;

/**
 *
 * @author Mrunal
 */
public abstract class RequestBloodWorkRequest {

    //int id = 0;
    String BloodType;
    int qty;
    UserAccount sender;
    UserAccount receiver;
    String status;
    String uniqueID = UUID.randomUUID().toString();
    

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

//    public int getId() {
//        return id;
//    }

    String patienName;

    public String getPatienName() {
        return patienName;
    }

    public void setPatienName(String patienName) {
        this.patienName = patienName;
    }
    

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public RequestBloodWorkRequest() {
       // id = ++id;
    }

    @Override
    public String toString() {
        return uniqueID;
    }

    
}
