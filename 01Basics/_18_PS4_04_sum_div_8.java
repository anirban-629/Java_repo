package Main.Codes;
import java.util.Scanner;
public class _18_PS4_04_sum_div_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        int i=0,sum=0;
        while (i<=n){
            if(i%8==0){
                sum+=i;
            }
            i++;
        }
        System.out.print("Sum -> "+sum);
    }
}
