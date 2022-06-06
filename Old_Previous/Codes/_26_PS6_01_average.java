package com.company;

public class _26_PS6_01_average {
    static int avg(int ...arr){
        int n= arr.length;
        int avg,sum = 0;
        for (int j:arr){
            sum+=j;
        }
        avg=sum/n;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println("Average: "+avg(1,2,3));
    }
}
