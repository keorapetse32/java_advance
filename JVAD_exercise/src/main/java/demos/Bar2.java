/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import tests.Foo2;

/**
 *
 * @author keora
 */
public class Bar2 extends Foo2 {
    private int sum = 10;
    private int result = 30;
    public void reportSum() {
        sum += result;
    }
}
