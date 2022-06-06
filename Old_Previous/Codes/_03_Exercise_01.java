package com.company;
import java.util.Scanner;
public class _03_Exercise_01 {
    public static void main(String[] args) {
        System.out.println("Welcome to Percentage Calculator:- ");
        System.out.println("Enter the marks out of 100: ");
        Scanner s=new Scanner(System.in);
        float com,phy,chem,math,bio,percentage;
        System.out.print("Computer: ");
        com=s.nextInt();
        System.out.print("Physics: ");
        phy=s.nextInt();
        System.out.print("Chemistry: ");
        chem=s.nextInt();
        System.out.print("Mathematics: ");
        math=s.nextInt();
        System.out.print("Biology: ");
        bio=s.nextInt();
        percentage= (float)(((com+phy+chem+math+bio)/500)*100);
        System.out.println("Overall Percentage: ");
        System.out.println(percentage);
    }
}
