package Old_Practices.Codes;
import java.util.Scanner;
public class _26_PS6_01_Multiplication_table {
    static void mul(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        mul(n);
    }
}
