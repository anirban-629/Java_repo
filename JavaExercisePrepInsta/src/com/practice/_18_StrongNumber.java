package com.practice;
public class _18_StrongNumber {

    public static int fact(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static int strongVal(int n) {
        int sum = 0, temp = n, rem;
        while (temp != 0) {
            rem = temp % 10;
            sum += fact(rem);
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=145;
        if(strongVal(n)==n){
            System.out.println("STRONG");
        }
        else{
            System.out.println("NOT STRONG");
        }
    }
}
