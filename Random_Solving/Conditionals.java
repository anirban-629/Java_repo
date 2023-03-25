import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        Boolean condition=(age==18);
        if (age>18){
            System.out.println("You can Drive");
        }
        else if (condition){
            System.out.println("You can Drive");
        }
        else {
            System.out.println("You can not Drive");
        }
        sc.close();
    }
}
