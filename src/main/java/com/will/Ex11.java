package com.will;

//Given a string, return a new string where the first and last chars have been exchanged.

public class Ex11 {

    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        char first = str.charAt(0);
        String middle = str.substring(1, str.length() - 1);
        char last = str.charAt(str.length() - 1);
        return last + middle + first;
    }

}
