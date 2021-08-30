/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeSearch17;

import EmployeeSearch10.Employee;
import EmployeeSearch10.Role;
import java.util.List;

/**
 *
 * @author keora
 */
public class A01OldStyleLoop {
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        double sum = 0;
        
        for(Employee e:eList){
            if(e.getState().equals("CO") &&
                    e.getState().equals(Role.EXECUTIVE)){
                e.printSummary();
                sum += e.getSalary();
            }
        }
        System.out.printf("Total CO Executive pay:$%,9.2f %n", sum);
    }
}
