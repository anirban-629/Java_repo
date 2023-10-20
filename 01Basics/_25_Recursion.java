package Main.Codes;
import java.util.Scanner;
public class _25_Recursion {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Factorial "+n+" : "+factorial(n));
    }
}
