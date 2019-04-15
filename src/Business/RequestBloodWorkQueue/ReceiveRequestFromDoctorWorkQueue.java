/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestBloodWorkQueue;

import Business.DoctorWorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author Mrunal
 */
public class ReceiveRequestFromDoctorWorkQueue {
    private ArrayList<RequestBloodWorkRequest> workRequestList;


    public ArrayList<RequestBloodWorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    

 
 public ReceiveRequestFromDoctorWorkQueue() {
        workRequestList = new ArrayList();
    }
}
