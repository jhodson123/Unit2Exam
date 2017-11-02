package com.company;

public class Main {

    public static void main(String[] args) {

        Code code1 = new Code("17395637");

        System.out.println(code1.getCode());
        code1.hide(3,6);
        System.out.println(code1.getCode());
        code1.recover(4,7);
        System.out.println(code1.getCode());


        HighSchoolClass Class = new HighSchoolClass();
    }
}
