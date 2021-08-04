/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.com;

/**
 *
 * @author keora
 */
public class A01MathTest {
    public static void main(String[] args) {
    System.out.println("Random: " + Math.random() * 10);
    System.out.println("Square root: " + Math.sqrt(9.0));
    System.out.println("Rounded random: " + 
        Math.round(Math.random()*100));
    System.out.println("Abs: " + Math.abs(-9));
  }
}
