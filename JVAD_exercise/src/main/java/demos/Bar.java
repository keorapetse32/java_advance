/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import tests.Foo;

/**
 *
 * @author keora
 */
public class Bar extends Foo {
    private int sum = 10;
    public void reportSum() {
        sum += result;
        //sum += value;  // compiler error
    }
}
