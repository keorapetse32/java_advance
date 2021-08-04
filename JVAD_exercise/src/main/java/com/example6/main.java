/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example6;

/**
 *
 * @author keora
 */
public class main {
    public static void main(String args[])
{
Employee emp1 = new Employee(121, "Ron", "ab123", 5000);
System.out.print("employee details"+emp1);
//Employee emp2 = new Employee(122, "ken", "def123", 6000);
Employee emp2 = new Employee(121, "Ron", "ab123", 5000);
if(emp1.equals(emp2))
{
    System.out.print("employee objects are equal");
    
    
}

else
{
   System.out.print("employee objects are  not equal"); 
}

}
}
