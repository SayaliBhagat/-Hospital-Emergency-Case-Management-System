/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;



import Business.Camp.CampDirectory;
import Business.DoctorWorkQueue.WorkQueue;
import Business.Organ.OrganDirectory;
import Business.Organisation.Organization;
import Business.Organisation.OrganizationDirectory;
import Business.PathLab.PathLabDirectory;
import Business.Patient.PatientDirectory;

/**
 *
 * @author Mrunal
 */
public abstract class Enterprise extends Organization  {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private PatientDirectory patientDirectory ;
    private CampDirectory campDirectory;
    private OrganDirectory organDirectory;
    private PathLabDirectory labDirectory;
    

    
    
    
    
   public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
    

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public CampDirectory getCampDirectory() {
        return campDirectory;
    }

    public OrganDirectory getOrganDirectory() {
        return organDirectory;
    }

    public PathLabDirectory getLabDirectory() {
        return labDirectory;
    }
    
    
    
    
    
    
    
      public enum EnterpriseType{
        Hospital("Hospital"),
        BloodBank("BloodBank"),
        OrganInventory("OrganInventory"),
        Lab("PathLab");
       
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
            if(this.value == "Hospital")
            {
                
            }
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
      
      
      public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
       patientDirectory = new PatientDirectory();
       organDirectory = new OrganDirectory();
       campDirectory = new CampDirectory();
       labDirectory = new PathLabDirectory();


    }
      
      
      
    
    
    
}
