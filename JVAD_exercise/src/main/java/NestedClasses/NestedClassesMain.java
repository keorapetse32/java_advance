/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedClasses;

/**
 *
 * @author keora
 */
public class NestedClassesMain {
    public static void main(String[] args) {
        
        OuterClass co = new OuterClass();
        co.method1();
        co.method2();
        
        co.r.run();
        
        OuterClass.InnerClass i = co.new InnerClass();
        i.innerPrint();
        
        OuterClass.StaticNestedClass sn = new OuterClass.StaticNestedClass();
        sn.staticNestedPrint();
        
        OuterClass.A.B nested = co.new A().new B();
    }
}
