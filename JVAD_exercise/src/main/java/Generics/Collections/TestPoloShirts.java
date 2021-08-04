/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics.Collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author keora
 */
public class TestPoloShirts {
    public static void main(String[] args){
        Set<PoloShirt> shirtList = new TreeSet<>();
        shirtList.addAll(Arrays.asList(PoloShirt.Black, PoloShirt.Blue, PoloShirt.Maroon));
        
        for(PoloShirt p:shirtList){
            System.out.println(p.toString() + " Polo --" + " PartNo: " 
                    + p.getPartNumber() + " Desc: " + p.getDescription());
        }
    }
}
