package com.company;

public class _23_Method_Overloading {
    static void foo(){
        System.out.println("Hello");
    }
    static void foo(int a){
        System.out.println("Your Value "+a);
    }
    static void foo(int a,int b){
        System.out.println("Your values a="+a+"b="+b);
    }
    static void changeInt(int a){
        a=40;
    }
    static void changeArray(int [] a){
        a[0]=0;
        a[1]=10;
    }

    public static void main(String[] args) {
        foo();
        foo(10);
        foo(10,20);
        int [] arr ={123,213,43,34534,56,65};
        int a=50;
        changeInt(a);
        System.out.println("After calling the function a is : "+a);
        changeArray(arr);
        System.out.println("After calling the function array is: " + arr[0]);
        System.out.println("After calling the function array is: " + arr[1]);

    }
}
