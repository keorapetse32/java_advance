/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5_p2;

/**
 *
 * @author keora
 */
public class Main {
    public static void main(String[] args) {
        
        // Create employees
        Employee jane = new Employee("Jane Doe", "Manager", "HR", 65000);
        Employee john = new Employee("John Doe", "Staff", "HR", 55000);
        
        System.out.println("Jane's witholding: " + jane.getWitholding());
        System.out.println("John's bonus " + john.getBonus());
    }
}
