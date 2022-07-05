package com.practice;
public class _23_AbundantNumber {
    public static void main(String[] args) {
        int n = 12, sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        if (sum > n) {
            System.out.println("ABUNDANT");
        } else {
            System.out.println("NOT ABUNDANT");
        }
    }
}
