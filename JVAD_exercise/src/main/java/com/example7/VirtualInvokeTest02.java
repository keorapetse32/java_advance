/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example7;

/**
 *
 * @author keora
 */
public class VirtualInvokeTest02 {
    public static void main(String[] args) {
    Employee e = new Manager(102, "Joan Kern", 
        "012-23-4567", 110_450.54, "Marketing");
    
    System.out.println(e.getDetails());
  }
}
