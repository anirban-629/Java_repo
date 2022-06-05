package com.company;
import java.util.Scanner;

public class _04_PS1_02_Greet {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        s=sc.nextLine();
        System.out.println("Hello "+s+" have a good day..!");
    }
}
