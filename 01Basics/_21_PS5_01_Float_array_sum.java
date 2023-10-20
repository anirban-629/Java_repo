package Main.Codes;
import java.util.Scanner;
public class _21_PS5_01_Float_array_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float [] num=new float[5];
        float sum=0;
        for (int i=0;i<num.length;i++){
            System.out.print("Number "+(i+1)+": ");
            num[i]=sc.nextFloat();
        }
//        for(int i=0;i<num.length;i++){
//            sum+=num[i];
//        }
        for (float ele:num){
            sum+=ele;
        }
        System.out.print("Sum = "+sum);
    }
}
