package com.practice;
public class _19_PerfectNumber {
    public static void main(String[] args) {
        int n = 28, sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
                // System.out.println("I -> "+i+", Sum -> "+sum);
            }
        }
        if (sum == n) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not Perfect");
        }
    }
}
