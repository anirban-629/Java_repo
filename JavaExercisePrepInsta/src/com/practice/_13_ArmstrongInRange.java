package com.practice;
public class _13_ArmstrongInRange {
    public static int len(int a) {
        int temp1 = a, len = 0;
        while (temp1 != 0) {
            len++;
            temp1 /= 10;
        }
        return len;
    }

    public static boolean armstrong(int num, int len) {
        int temp = num, sum = 0, rem;
        double val;
        while (temp != 0) {
            rem = temp % 10;
            val = Math.pow(rem, len);
            sum += val;
            temp /= 10;
        }
        return num == sum;
    }

    public static void main(String[] args) {
        int a = 0;
        int b=1000;
        for (int i = a; i < b; i++) {
            if(armstrong(i, len(i))){
                System.out.println(i);
            }
        }
    }
}