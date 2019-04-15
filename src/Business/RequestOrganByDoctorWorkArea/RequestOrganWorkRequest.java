/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestOrganByDoctorWorkArea;

import Business.UserAccount.UserAccount;

/**
 *
 * @author puja_
 */
public abstract class RequestOrganWorkRequest {
    String OrganType;
    String BloodType;
    int qty;
    UserAccount sender;
    UserAccount receiver;
    String status;

    public String getOrganType() {
        return OrganType;
    }

    public void setOrganType(String OrganType) {
        this.OrganType = OrganType;
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
    
    
    
}
