/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticExamples;

/**
 *
 * @author keora
 */
public class A04StaticInitializerTest {
    private static final boolean[] switches = new boolean[5];
  
  static{
    System.out.println("Initializing...");
    for (int i=0; i<5; i++){
      switches[i] = true;
    }
  }
  
  public static void main(String[] args) {
    switches[1] = false; switches[2] = false;
    System.out.print("Switch settings: ");
    for (boolean curSwitch:switches){
      if (curSwitch){System.out.print("1");}
      else {System.out.print("0");}
    }
    System.out.println();
  }
}
