package com.practice;
public class _26_LCM {
 public static void main(String[] args) {
    int a=12,b=14,lcm=0;
    for (int i = 1; i <= a*b; i++) {
        if(i%a==0&&i%b==0){
            lcm=i;
            break;
        }
    }
    System.out.println("LCM of " + a + " and " + b + " is : " + lcm);
}   
}
