package com.company;

import java.util.Scanner;
import java.util.jar.Pack200;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HighSchoolClass hsc = new HighSchoolClass();
        Code code = null;

        System.out.println("Enter 1 to play code game or 2 to play Highschool game");
        int l = input.nextInt();

        if (l==1) {
            while (true) {

                System.out.println("Enter 1 to enter a new code \n" +
                        "Enter 2 to hide \n" +
                        "Enter 3 to recover \n" +
                        "Enter 4 to show code \n" +
                        "Enter 0 to exit");
                int j = input.nextInt();

                if (j == 1) {

                    System.out.println("Enter Code: ");
                    String c = input.next();
                    code = new Code(c);
                } else if (j == 2 && code != null) {

                    System.out.println("Enter Start position: ");
                    int pos1 = input.nextInt();
                    System.out.println("Enter End position: ");
                    int pos2 = input.nextInt();

                    code.hide(pos1, pos2);
                } else if (j == 3 && code != null) {

                    System.out.println("Enter Start position: ");
                    int pos1 = input.nextInt();
                    System.out.println("Enter End position: ");
                    int pos2 = input.nextInt();

                    code.recover(pos1, pos2);
                } else if (j == 4) {

                    System.out.println(code.getCode());
                } else if (j == 0) {

                    break;
                } else
                    System.out.println("Enter a valid number");
            }
        }
        else if (l==2){
            while (true) {

                System.out.println("Enter 1 to find Students GPA \n" +
                                    "Enter 2 to find Honors Percentage \n" +
                                    "Enter 3 to find the Valedictorian \n" +
                                    "Enter 0 to exit");
                int j = input.nextInt();

                if(j==1){

                    System.out.println("Enter index of Student (0-9)");
                    int k = input.nextInt();
                    Student student = hsc.getStudent(k);
                    System.out.println(student.getGPA());
                }
                else if(j==2){

                    System.out.println(hsc.getHonorsPercentage());
                }
                else if(j==2){

                    System.out.println(hsc.getValedictorian());
                }
                else if(j==0){

                    break;
                }
                else
                    System.out.println("Enter a valid number");
            }
        }
    }
}
