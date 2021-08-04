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
public class Manager extends Employee {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Manager(int empId, String name, String ssn, double salary, String dept) {
      super(empId, name, ssn, salary);
      deptName = dept;
    }

    @Override
    public String getDetails() {
      return super.getDetails () + 
        " Dept: " + deptName;
    }

    @Override
    public String getAllDetails() {
      return super.getDetails () + 
        " Dept: " + deptName;
    }
}
