package Main.Codes;
import java.util.Scanner;
public class _26_PS6_01_Pattern1 {
    public static void main(String[] args) {
        System.out.print("Enter the number of row: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
