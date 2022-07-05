package com.practice;
public class _10_Reverse {
    public static void main(String[] args) {
        int num = 12345;
        int rem = 0;
        int temp=num;
        int revNum=0;
        while(temp!=0){
            rem=temp%10;
            temp/=10;
            revNum=revNum*10+rem;
        }
        System.out.println(revNum);
    }
}
