/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrganWorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author puja_
 */
public abstract class OrganCollectionWorkRequest {
    
     int id;
     UserAccount sender;
     UserAccount receiver;
     String Status;
     int qty;
     String bloodtype;
     String organtype;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getOrgantype() {
        return organtype;
    }

    public void setOrgantype(String organtype) {
        this.organtype = organtype;
    }
     
     
    
}
