/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Krishi
 */
public class hospitalDirectory {
    
    private ArrayList<hospital> hospitalDirectory;

    public hospitalDirectory() {
        this.hospitalDirectory = new ArrayList<hospital>();
    }
  
    public ArrayList<hospital> gethospitalDirectory() {
        return hospitalDirectory;
    }

    public void sethospitalDirectory(ArrayList<hospital> hospitalDirectory) {
        this.hospitalDirectory= hospitalDirectory;
    }
      
   
     //public Person addNewPerson() {
      //  System.out.println(" add function called in personDirectory  start"); 
       // Person person = new Person();
       // System.out.println(" add function called in personDirectory");
       // hospitalDirectory.add(hospital);
       // return person;      
    //}
     
    //public void removePerson(Person person){
     //   hospitalDirectory.remove(hospital);
    //}
    
    public ArrayList<hospital> searchhospital(String key)
  {
        ArrayList<hospital> searchhospitalDirectory = new ArrayList();
       for(hospital hospital: hospitalDirectory)
      {
         if(hospital.getCommunityName().toLowerCase().startsWith(key.toLowerCase()))
        {
             searchhospitalDirectory.add(hospital);
         } else {
         }
     }
        return searchhospitalDirectory;
    }

    
    
}
