package Old_Practices.Codes;
// package com.company;
import java.util.Scanner;
public class _13_PS3_03_Website_Checking_by_Extension {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Website Name: ");
        String website=sc.next();
        if(website.endsWith(".org")){
            System.out.println("Organizational Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian Website");
        }
        else if(website.endsWith(".com")) {
            System.out.println("Commercial Website");
        }
    }
}
