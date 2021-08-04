/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics.Collections;

/**
 *
 * @author keora
 */
public class Student {
    private String name;
    private long id = 0;
    private double gpa = 0.0;

    public Student(String name, long id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public double getGpa() {
        return this.gpa;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "  ID: " + this.id
                + "  GPA:" + this.gpa;
    }
}
