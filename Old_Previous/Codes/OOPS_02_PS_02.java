package com.company;
class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}

public class OOPS_02_PS_02 {
    public static void main(String[] args) {
        cellPhone c=new cellPhone();
        c.ring();
        c.vibrate();
    }
}
