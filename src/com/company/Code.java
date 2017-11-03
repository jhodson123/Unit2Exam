package com.company;

import java.util.Arrays;

/**
 * Created by jh424 on 11/2/17.
 */
public class Code {

    private String myCode;
    private String originalCode;

    public Code(String code)
    {

        myCode = code;
        originalCode = code;
    }
    public String getCode()
    {

        return myCode;
    }

    public void hide(int p1, int p2)
    {

        if(p1>0 && p2>p1 && p2<myCode.length()){

            char[] c = myCode.toCharArray();
            Arrays.fill(c, p1, p2, 'X');
            myCode = new String(c);
        }
        else
            System.out.println("Enter valid numbers");
    }

    public void recover(int p1, int p2)
    {

        if(p1>0 && p2>p1 && p2<myCode.length()) {
            myCode = myCode.substring(0, p1) +
                    originalCode.substring(p1, p2) +
                    myCode.substring(p2, myCode.length());
        }
        else
            System.out.println("Enter valid numbers");
    }
}

