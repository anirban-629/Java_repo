package com.practice;
public class _24_FriendlyPair {
    public static int getDivisorsSum(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1=6,n2=2;
        int s1=getDivisorsSum(n1);
        int s2=getDivisorsSum(n2);
        if(s1/n2 ==s2/n2){
            System.out.println("FRIENDLY PAIR");
        }else{
        System.out.println("NOT FRIENDLY PAIR");
        }
    }
}
