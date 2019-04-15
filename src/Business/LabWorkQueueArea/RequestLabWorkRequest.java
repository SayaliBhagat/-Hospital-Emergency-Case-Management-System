/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabWorkQueueArea;

import Business.DoctorWorkQueue.GetDoctorWorkRequest;

/**
 *
 * @author puja_
 */
public class RequestLabWorkRequest extends RequestLabWorkAreaRequest {
      GetDoctorWorkRequest gdwr ;

    public GetDoctorWorkRequest getGdwr() {
        return gdwr;
    }

    public void setGdwr(GetDoctorWorkRequest gdwr) {
        this.gdwr = gdwr;
    }
}
