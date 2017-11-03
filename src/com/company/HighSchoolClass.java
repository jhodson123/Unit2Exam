package com.company;

import java.util.Random;

/**
 * Created by jh424 on 11/2/17.
 */
public class HighSchoolClass {

    private Student [] students = new Student[10];
    private Random rand = new Random();


    public HighSchoolClass(){

        boolean t;
        for (int i=0;i<10;i++){

            int x = rand.nextInt(2);
            if(x==1)
                t = true;
            else
                t = false;

            students[i] = new Student((Math.random()*5), t);
        }
    }

    public Student getStudent(int index){

        return students[index];
    }

    public Student getValedictorian()
    {

        double highestGPA = 0;
        Student valedictorian = null;

        for (Student s: students){

            if (s.getGPA() > highestGPA) {

                highestGPA = s.getGPA();
                valedictorian = s;
            }
        }

        return valedictorian;
    }

    public double getHonorsPercentage()
    {

        int count = 0;

        for (Student s: students){

            if(s.isHonors())
                count++;
        }
        return (count/students.length)*100;
    }
}
