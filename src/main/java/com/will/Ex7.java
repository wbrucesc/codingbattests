package com.will;

public class Ex7 {


/*    Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number.*/

    public static boolean nearHundred(int n) {
        if ((Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10)) {
            return true;
        } else {
            return false;
        }
    }

}
