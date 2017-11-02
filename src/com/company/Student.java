package com.company;

/**
 * Created by jh424 on 11/2/17.
 */
public class Student {

    private double GPA;
    private boolean honors;

    public Student(double i, boolean b){

        GPA = i;
        honors = b;
    }

    public double getGPA(){

        return GPA;
    }

    public boolean isHonors(){

        if(GPA >= 90)
            return true;
        else
            return false;
    }
}
