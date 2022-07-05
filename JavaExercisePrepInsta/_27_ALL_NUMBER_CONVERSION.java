package com.practice;
import java.util.ArrayList;

/*
 * DECIMAL--> BINARY
 * DECIMAL--> OCTAL
 * DECIMAL--> HEXADECIMAL
 * 
 * BINARY--> DECIMAL 
 * BINARY--> OCTAL
 * BINARY--> HEXADECIMAL
 * 
 * OCTAL--> BINARY
 * OCTAL--> DECIMAL
 * OCTAL--> HEXADECIMAL
 * 
 * HEXADECIMAL--> BINARY
 * HEXADECIMAL--> DECIMAL
 * HEXADECIMAL--> OCTAL
 */

class decimalConv {
    public int binToDec(int n) {
        int a = n, i = 0, rem, dec = 0;
        while (a != 0) {
            rem = a % 10;
            dec += (rem * Math.pow(2, i));
            i++;
            a /= 10;
        }
        return dec;
    }

    public int octToDec(int n) {
        int a = n, i = 0, rem, dec = 0;
        while (a != 0) {
            rem = a % 10;
            dec += (rem * Math.pow(8, i));
            i++;
            a /= 10;
        }
        return dec;
    }

    public int hexToDec(int n) {
        int a = n, i = 0, rem, dec = 0;
        while (a != 0) {
            rem = a % 10;
            dec += (rem * Math.pow(16, i));
            i++;
            a /= 10;
        }
        return dec;
    }
}

class binaryConv extends decimalConv {
    public int decToBin(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, a = n, rem, bin = 0;
        // 11001000
        while (a != 0) {
            if (a % 2 == 0) {
                rem = 0;
            } else {
                rem = 1;
            }
            arr.add(rem);
            i++;
            a /= 2;
        }
        for (int j = arr.size() - 1; j >= 0; j--) {
            bin = bin * 10 + arr.get(j);
        }
        return bin;
    }

    public int octToBin(int n) {
        int dec = octToDec(n);
        int bin = decToBin(dec);
        return bin;
    }

    public int hexToBin(int n) {
        int dec=hexToDec(n);
        int bin=decToBin(dec);
        return bin;
    }
}

class octalConv extends decimalConv{
    // public int binToOct(int n){
        // int a=n,rem,oct=0;
        // while(a!=0){ 
            // rem=a%1000;
            // oct=oct*10+binToDec(n)
        // }

    // }
    // public int decToOct(int n){

    // }
    // public int hexToOct(int n){

    // }

}
public class _27_ALL_NUMBER_CONVERSION {
    public static void main(String[] args) {
        int bNum = 11101;
        int dNum = 200;
        int oNum = 222;
        int hNum = 360;

        decimalConv dConv = new decimalConv();
        binaryConv bConv = new binaryConv();

        // System.out.println("Binary --> Decmial of " + bNum + " is : " + dConv.binToDec(bNum));
        // System.out.println("Octal --> Decmial of " + oNum + " is : " + dConv.octToDec(oNum));
        // System.out.println("Hexadecimal --> Decmial of " + hNum + " is : " + dConv.hexToDec(hNum));

        // System.out.println("Decimal     --> Binary  of " + dNum + " is : " + bConv.decToBin(dNum));
        // System.out.println("Octal --> Binary of " + oNum + " is : " + bConv.octToBin(oNum));
        // System.out.println("Hexadecimal --> Binary of " + hNum + " is : " +bConv.hexToBin(hNum));

        // System.out.println("Decimal     --> Binary  of " + dNum + " is : " + bConv.decToBin(dNum));
        // System.out.println("Octal --> Binary of " + oNum + " is : " + bConv.octToBin(oNum));
        // System.out.println("Hexadecimal --> Binary of " + hNum + " is : " +bConv.hexToBin(hNum));
    }
}