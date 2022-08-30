/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args) {
        // declare and initialise an object
        StudentMarks studentMarks = new StudentMarks();
        // call the methods and print the values
        int businessPathWay = studentMarks.calculateMarks(10, 20, 30);
        System.out.println("businessPathWay = " + businessPathWay);
        int medicalPathWay = studentMarks.calculateMarks(20, 50, 70, 30);
        System.out.println("medicalPathWay = " + medicalPathWay);
        int nonMedicalPathWay = studentMarks.calculateMarks(70, 80, 90);
        System.out.println("nonMedicalPathWay = " + nonMedicalPathWay);
    }
}
