package Old_Practices.Codes;
import java.util.Scanner;
public class _18_PS4_02_Sum_of_Even_Natural_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int i,sum=0;

//        WHILE LOOP
//        while(i<=n){
//            if(i%2==0){
//                sum=sum+i;
//            }
//            i++;
//        }

//        FOR LOOP
        for(i=1;i<=n;i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of "+n+" Natural Numbers are: "+sum);
    }
}
