/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author keora
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(121, "Ron", "111-11-1111", 5000);
        System.out.println("Employee 1: "+ emp1.getDetails());
        
        Employee emp2 = new Employee(122, "Ken", "222-22-2222", 6000);
        System.out.println("Employee 2: "+emp2.getDetails());
    }
}
