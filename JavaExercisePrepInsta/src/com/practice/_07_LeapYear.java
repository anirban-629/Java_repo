package com.practice;
public class _07_LeapYear {
    public static void ifElse(int y) {
        if(y%400==0){
            System.out.println("LEAP YEAR 1");
        }
        else if(y%4==0 && y%100!=0){
            System.out.println("LEAP YEAR 2");
        }
        else{
            System.out.println("NOT LEAP YEAR ifelse");
        }
    }

    public static void unary(int y) {
        boolean lpyr=(y%400==0) || (y%4==0 && y%100!=0) ? true:false;
        if(lpyr){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("NOT LEAP YEAR Unary");
        }
    }

    public static void main(String[] args) {
        int year=2020;
        ifElse(year);
        unary(year);
    }
}
