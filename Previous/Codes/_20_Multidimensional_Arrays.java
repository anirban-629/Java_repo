package com.company;
import java.util.Scanner;
public class _20_Multidimensional_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[3][3];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("Arr["+i+"]"+"["+j+"] : ");
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("["+i+"]"+"["+j+"] : ");
            }
            System.out.println();
        }
    }
}
