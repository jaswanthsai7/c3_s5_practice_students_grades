/*
 * Author Name : Jaswanth Sai
 * Date : 8/30/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.marks;

public class StudentMarks {
    private int sum;

    public int calculateMarks(int math, int physics, int chemistry, int biology) {
        sum = math + physics + chemistry + biology;
        return sum;

    }

    public int calculateMarks(int math, int physics, int chemistry) {
        sum = math + physics + chemistry;
        return sum;

    }

}
