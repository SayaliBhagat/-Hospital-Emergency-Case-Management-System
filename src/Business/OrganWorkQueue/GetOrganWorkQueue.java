/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrganWorkQueue;

import java.util.ArrayList;

/**
 *
 * @author puja_
 */
public class GetOrganWorkQueue {
     private ArrayList<OrganCollectionWorkRequest> getOrganWorkQueueList;

    public ArrayList<OrganCollectionWorkRequest> getGetOrganWorkQueueList() {
        return getOrganWorkQueueList;
    }
    
     
     public GetOrganWorkQueue()
    {
        getOrganWorkQueueList = new ArrayList();
    }
}
