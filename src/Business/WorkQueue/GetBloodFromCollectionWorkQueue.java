/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DoctorWorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author puja_
 */
public class GetBloodFromCollectionWorkQueue {
    
    private ArrayList<BloodCollectionWorkRequest> getBloodWorkQueueList;

    public ArrayList<BloodCollectionWorkRequest> getGetBloodWorkQueueList() {
        return getBloodWorkQueueList;
    }
    public GetBloodFromCollectionWorkQueue()
    {
        getBloodWorkQueueList = new ArrayList();
    }
    
}
