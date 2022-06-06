package com.company;

public class _09_PS_Strings_04_Detecting_Spaces {
    public static void main(String[] args) {
        String str="My name is  Anirban   Mishra";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
        System.out.println(str.indexOf("    "));
//        As here isn't 4  spaces that's why it'll return -1
    }
}
