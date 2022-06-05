package com.company;

import java.util.Scanner;

public class _21_PS5_02_elment_presence {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int [] num=new int[5];
        int n;
        boolean inArray=false;

        for (int i=0;i<num.length;i++){
            System.out.print("Number "+(i+1)+": ");
            num[i]=sc.nextInt();
        }

        System.out.print("Enter the element for Search: ");
        n= sc.nextInt();

        for (int ele:num){
            if(n==ele){
                inArray=true;
                break;
            }
        }

        if(inArray){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
