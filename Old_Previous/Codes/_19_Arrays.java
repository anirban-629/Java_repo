package com.company;
import java.util.Scanner;
public class _19_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        1. Declaration + memory allocation

//        int [] numbs;
//        numbs =new int[5];

//        2. Declaration +memory allocation+ initialization
//        int [] numbs={10,20,30,40,50};
//        System.out.println(numbs[4]);

//        3. User Input
        int [] numbers=new int[5];
        for (int i=0;i<numbers.length;i++){
            System.out.print("Number "+i+1+": ");
            numbers[i]=sc.nextInt();
        }
//        for (int i=0;i<5;i++){
//            System.out.println("Number "+i+1+": "+numbers[i]);
//        }

        for (int ele :numbers){
            System.out.println(ele);
        }
    }
}
