package com.will;

public class Ex2 {

/*  Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.*/

    public static double diff21(double n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return 21 - n;
        }
    }


}
