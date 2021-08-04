/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inner;

/**
 *
 * @author keora
 */
public class OuterClass {
    private int privInt = 10;
 
  
 public void createInnerClass() {

 InnerClass inClass = new InnerClass();
 inClass.accessOuter();
 }
 

 class InnerClass {  
   
  public void accessOuter() {

  System.out.println("The outer class's privInt is " + privInt);

  } 

 }
}
