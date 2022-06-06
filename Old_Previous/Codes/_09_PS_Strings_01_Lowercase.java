package com.company;
import java.util.Scanner;
public class _09_PS_Strings_01_Lowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.next();
        System.out.println("String in Lower case: "+str.toLowerCase());
    }
}
