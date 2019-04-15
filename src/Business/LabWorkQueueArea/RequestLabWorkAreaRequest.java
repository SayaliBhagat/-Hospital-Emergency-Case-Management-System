/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabWorkQueueArea;

import Business.DoctorWorkQueue.GetDoctorWorkRequest;
import Business.UserAccount.UserAccount;

/**
 *
 * @author puja_
 */
public abstract class RequestLabWorkAreaRequest {
    
    int id;
    UserAccount sender;
    UserAccount receiver;
    String testType;
    String result;
    String status;
     

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

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
