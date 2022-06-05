package com.company;
import java.util.Scanner;
public class _26_PS6_01_Pattern2 {
    public static void main(String[] args) {
        System.out.print("Enter the number of row: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
