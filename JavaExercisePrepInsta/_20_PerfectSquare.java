package com.practice;
public class _20_PerfectSquare {
    public static void main(String[] args) {
        int n = 49;

        System.out.println(Math.floor((double) (Math.sqrt(n))));
        System.out.println(Math.ceil((double) (Math.sqrt(n))));

        if (Math.floor((double) (Math.sqrt(n))) == Math.ceil((double) (Math.sqrt(n)))) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }
    }
}
