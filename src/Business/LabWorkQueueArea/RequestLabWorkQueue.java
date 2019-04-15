/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabWorkQueueArea;

import java.util.ArrayList;

/**
 *
 * @author puja_
 */
public class RequestLabWorkQueue {
     private ArrayList<RequestLabWorkAreaRequest> labWorkRequestList;

    public ArrayList<RequestLabWorkAreaRequest> getLabWorkRequestList() {
        return labWorkRequestList;
    }
    
    public RequestLabWorkQueue() {
        labWorkRequestList = new ArrayList();
    }
}
