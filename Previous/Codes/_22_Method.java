package com.company;

public class _22_Method {
//    static int logic(int x,int y){
//        int z;
//        if(x>y){
//            z=(x+y);
//        }
//        else{
//            z=(y-x);
//        }
//        return z;
//    }
int logic(int x,int y){
    int z;
    if(x>y){
        z=(x+y);
    }
    else{
        z=(y-x);
    }
    return z;
}
    public static void main(String[] args) {
        int a=10,b=20;
//        int result=logic(a,b);
//        if there, we don't use the static keyword then we have to make objects...
        _22_Method obj=new _22_Method();
        int result=obj.logic(a,b);
        System.out.println(result);
    }
}
