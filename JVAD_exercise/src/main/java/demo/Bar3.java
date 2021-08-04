/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import test.Foo3;

/**
 *
 * @author keora
 */
public class Bar3 extends Foo3 {
    private int sum = 10;
    public void reportSum() {
        sum += getResult();
    }
}
