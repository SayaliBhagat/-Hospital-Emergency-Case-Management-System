/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Camp;

import java.util.ArrayList;

/**
 *
 * @author sayalibhagat
 */
public class CampDirectory {
    private ArrayList<Camp> CampList;

     public CampDirectory() {
        CampList = new ArrayList();
    }

    public ArrayList<Camp> getCampList() {
        return CampList;
    }
    
   
}
