/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example7;

import com.example7.Employee;
import com.example7.Manager;

/**
 *
 * @author keora
 */
public class CastTest01 {
    public static void main(String[] args) {
    Employee e = new Manager(102, "Joan Kern", 
        "012-23-4567", 110_450.54, "Marketing");
    
    if (e instanceof Manager){
      Manager m = (Manager) e;
      m.setDeptName("HR");
      System.out.println(m.getDetails());
    }
  }
}
