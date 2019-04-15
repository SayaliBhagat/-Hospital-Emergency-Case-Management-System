/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DoctorWorkQueue;

import Business.RequestBloodWorkQueue.RequestBloodFromDoctorWorkRequest;

/**
 *
 * @author Mrunal
 */
public class GetDoctorWorkRequest extends WorkRequest{
    
    private String Diagnosis;
    
    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    
}
