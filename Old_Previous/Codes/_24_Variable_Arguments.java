package com.company;

public class _24_Variable_Arguments {
    static int sum(int ...arr){
//    ... arr -> int [] arr
    int result=0;
    for(int ele: arr)
    {
        result += ele;
    }
    return result;
}
    static int sum1(int x,int ...arr){
//    ... arr -> int [] arr
        int result=x;
        for(int ele: arr)
        {
            result += ele;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 1,2,3,4,5,6,7,8,9,10: "+sum(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Sum of 1,2,3,4,5,6,7,8,9,10: "+sum1(1,1,2,3,4,5,6,7,8,9,10));
//        it'll be 56
    }
}
