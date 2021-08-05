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
public class A03CounterTest {
    public static void main(String[] args) {
    System.out.println("Start: " + StaticCounter.getCount());
    StaticCounter.increment();
    StaticCounter.increment();
    System.out.println("End: " + StaticCounter.getCount());
  }
}
