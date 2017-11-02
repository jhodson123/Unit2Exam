package com.company;

/**
 * Created by jh424 on 11/2/17.
 */
public class HighSchoolClass {

    private Student [] students;


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
        return count/students.length;
    }
}
