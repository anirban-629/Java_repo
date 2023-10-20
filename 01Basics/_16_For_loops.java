package Main.Codes;
import java.util.Scanner;
public class _16_For_loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
}
