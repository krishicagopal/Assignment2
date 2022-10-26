/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;
import userInterface.Community;

/**
 *
 * @author Krishi
 */
public class commDirectory {
    private ArrayList<commclass> c;
    
    public void commDirectory(){
        
        c = new ArrayList<commclass>();
    }

    public ArrayList<commclass> getC() {
        return c;
    }

    public void setC(ArrayList<commclass> c) {
        this.c = c;
    }
    
    
    
    public commclass addNewCommunity() {
      
        commclass comm = new commclass();
      
       c.add(comm);
       return comm; 
    
}
    public void deleteC()
    {
        commclass comm = new commclass();
        c.remove(comm);
     }
}
  