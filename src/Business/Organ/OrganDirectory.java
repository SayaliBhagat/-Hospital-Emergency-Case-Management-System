/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organ;

import java.util.ArrayList;

/**
 *
 * @author puja_
 */
public class OrganDirectory {
    private ArrayList<Organ> OrganList;
    
    public OrganDirectory() {
        OrganList = new ArrayList();
    }

    public ArrayList<Organ> getOrganList() {
        return OrganList;
    }

   
}
