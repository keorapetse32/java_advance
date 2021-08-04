/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author keora
 */
public class TestComparator {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>(3);
        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGpa = new StudentSortGpa();
        
        studentList.add(new Student("Thomas Jefferson", 1111, 3.8));
        studentList.add(new Student("George Washington", 3333, 3.4));
        studentList.add(new Student("John Adams", 2222, 3.9));
        
        Collections.sort(studentList, sortName);       
        for(Student student:studentList){
            System.out.println(student);
        }
        
        Collections.sort(studentList, sortGpa);       
        for(Student student:studentList){
            System.out.println(student);
        }
    }
}
