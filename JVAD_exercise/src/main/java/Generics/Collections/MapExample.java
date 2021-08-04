/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics.Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author keora
 */
public class MapExample {
    public static void main(String[] args){      
        Map <String, String> partList = new TreeMap<>();
        partList.put("S001", "Blue Polo Shirt");
        partList.put("S002", "Black Polo Shirt");
        partList.put("H002", "Duke Hat");
        
        partList.put("S002", "Black T-Shirt"); // Overwrite value
        Set<String> keys = partList.keySet();
        
        System.out.println("=== Part List ===");
        for (String key:keys){
             System.out.println("Part#: " + key  );
            System.out.println("Value: " +  " " + partList.get(key));
            
        }
        
        
    }
}
