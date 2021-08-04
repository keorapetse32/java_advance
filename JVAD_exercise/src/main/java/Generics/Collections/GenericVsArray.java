/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics.Collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author keora
 */
public class GenericVsArray {
    public static void main(String[] args){
        
        // Fails at RunTime - ArrayStore Exception
        Object[] objectArr = new Integer[1];
        objectArr[0] = "Don't add me bro";
        
        // Fails at compile time - Incompatible Types Error
        //List<Object> objectList = new ArrayList<Integer>();
        //objectList.add("Don't add me bro");
    } 
}
