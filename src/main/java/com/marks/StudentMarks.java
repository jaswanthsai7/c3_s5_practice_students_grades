/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.marks;

public class StudentMarks {

    public int calculateMarks(int math, int physics, int chemistry, int biology) {
        return math + physics + chemistry + biology;

    }

    public double calculateMarks(double math, int physics, int chemistry) {
        return math + physics + chemistry;

    }

    public int calculateMarks(int businessStudies, int finance, int accounting) {
        return businessStudies + finance + accounting;
    }

}
