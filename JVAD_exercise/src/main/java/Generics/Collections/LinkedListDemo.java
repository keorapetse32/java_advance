/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics.Collections;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author keora
 */
public class LinkedListDemo {
    public static void main(String args[])
    {
        
    List <String> partList=new LinkedList<>();

   
    partList.add("bolt");
    partList.add("nut");
    partList.add("nail");
    

    for (String partObj:partList){
      String partName = partObj; // Demonstrates autoboxing.
      System.out.println("Part name: " + partName);  
    } 
    
    partList.add(1,"hammer");
    
    
    
      for (String partObj:partList){
      String partName = partObj; // Demonstrates autoboxing.
      System.out.println("Part name: " + partName);  
    } 
      
      partList.remove(2);
  }
}
