package com.practice;
public class _29_Permutation{
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int people=5,seats=5;
        System.out.println("Possible Arrangements: "+(factorial(people))/(factorial(people-seats))); //npr
    }
}