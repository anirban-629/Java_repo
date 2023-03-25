import java.util.Scanner;
public class Strings_Methods {
    public static void main(String[] args) {

        String name="AnIrBaN";
        System.out.println(name);
//        1.
        int length=name.length();
        System.out.println("The length of the String is: "+length);
//        2.
        System.out.println("UpperCase: "+name.toUpperCase());
        System.out.println("LowerCase: "+name.toLowerCase());
//        3.
        String str="               Anirban           ";
        System.out.println("After Triming: "+str.trim());
//        4.
        System.out.println("Using substring >> "+name.substring(3));
        System.out.println("Using substring >> "+name.substring(3,5));
//        6.
        String str1="aabb";
        System.out.println("After Replacing a and b : "+str1.replace('a','b'));
//        7.
        System.out.println("startsWith: ");
        System.out.println(name.startsWith("A"));
        System.out.println(name.startsWith("c"));
//        8.
        System.out.println("endsWiths: ");
        System.out.println(name.endsWith("N"));
        System.out.println(name.endsWith("a"));
//        9.
        System.out.println("Using Index position: ");
        System.out.println(name.charAt(2));
//        10.
        System.out.println("Index of: ");
        System.out.println(name.indexOf("A"));
        System.out.println(name.indexOf("An"));
        System.out.println(name.indexOf("A",0));
        System.out.println(name.indexOf("A",1));
//        11.
//        Last index of learn it first
//        12.
        System.out.println("Equals: ");
        System.out.println(name.equals("AnIrBaN"));
        System.out.println(name.equals("Anirban"));
        // equalIgnoreCase  
        System.out.println(name.equalsIgnoreCase("Anirban"));

        String s="Anirban is a bad boy";
        System.out.println("Replacing Spaces with Underscores: "+s.replace(" ","_"));

        Scanner sc=new Scanner(System.in);
        String letter="Hello <|name|>, Thanks alot..!";
        System.out.println("Enter name: ");
        String name1=sc.nextLine();
        System.out.println(letter.replace("<|name|>",name1));
        sc.close();
    }
}
