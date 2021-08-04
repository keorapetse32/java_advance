/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example7;

import com.example7.Manager;

/**
 *
 * @author keora
 */
public class GoodBonus {
    public double calcBonus(Employee e){
    if (e instanceof Employee){
      return e.getSalary() * 0.01;
    }else if (e instanceof Engineer){
      return e.getSalary() * 0.02;
    }else if (e instanceof Manager){
      return e.getSalary() * 0.03;
    }else if (e instanceof Director){
      return e.getSalary() * 0.05;
    }else {
      return 0;
    }
  }
}
