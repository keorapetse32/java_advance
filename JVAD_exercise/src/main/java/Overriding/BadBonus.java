/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

import Overriding.Director;
import Overriding.Employee;
import Overriding.Engineer;
import Overriding.Manager;

/**
 *
 * @author keora
 */
public class BadBonus {
    public double calcBonus(Employee e){
    return e.getSalary() * 0.01;
  }
  
  public double calcBonus(Manager m){
    return m.getSalary() * 0.03;
  }

  public double calcBonus(Engineer e){
    return e.getSalary() * 0.02;
  }

  public double calcBonus(Director d){
    return d.getSalary() * 0.05;
  }
}
