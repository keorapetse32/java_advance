/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

import Overriding.Employee;
import Overriding.Manager;

/**
 *
 * @author keora
 */
public class CastTest02 {
    public static void main(String[] args) {
    Employee e = new Manager(102, "Joan Kern", 
        "012-23-4567", 110_450.54, "Marketing");
    
    Manager m = (Manager)e; // ok
    //Engineer eng = (Manager)e; // Compile error
    System.out.println(m.getDetails());
  }
}
