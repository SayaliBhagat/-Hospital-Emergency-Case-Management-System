/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestOrganByDoctorWorkArea;

import java.util.ArrayList;

/**
 *
 * @author puja_
 */
public class ReceiveOrganRequestFromDoctorWorkQueue {
    
    private ArrayList<RequestOrganWorkRequest> organWorkRequestList;

    public ArrayList<RequestOrganWorkRequest> getOrganWorkRequestList() {
        return organWorkRequestList;
    }


   

    

 
 public ReceiveOrganRequestFromDoctorWorkQueue() {
        organWorkRequestList = new ArrayList();
    }
    
}
