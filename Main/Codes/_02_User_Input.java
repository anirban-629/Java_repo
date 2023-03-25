package Main.Codes;
import java.util.Scanner;
public class _02_User_Input {
    public static void main(String[] args) {
        System.out.println("sout shortcut for System.out.println");
        Scanner sc= new Scanner(System.in);

//        System.out.print("Enter a: ");
//        int a=sc.nextInt();
//        System.out.print("Enter b: ");
//        int b=sc.nextInt();
//        int sum=a+b;
//        System.out.print("Sum of a and b is: ");
//        System.out.println(sum);

//        System.out.print("Checking that is the number is int or not..! enter a number: ");
//        boolean bool=sc.hasNextInt();
//        System.out.println(bool);

        System.out.println("String input: ");
//        String s=sc.next();
        String s=sc.nextLine();
        System.out.println(s);

    }
}
