/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example10;

/**
 *
 * @author keora
 */
public class ShapeDemo {
    public static void main(String args[]) {
   // Shape f = new Shape(10, 10);
    Rectangle r = new Rectangle(9, 5);
    Triangle t = new Triangle(10, 8);

    Shape figref;

    figref = r;
    System.out.println("Area is " + figref.calculateArea());

    figref = t;
    System.out.println("Area is " + figref.calculateArea());

    //figref = f;
    System.out.println("Area is " + figref.calculateArea());
  } 
}
