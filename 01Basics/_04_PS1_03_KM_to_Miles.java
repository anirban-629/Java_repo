package Main.Codes;
import java.util.Scanner;
public class _04_PS1_03_KM_to_Miles {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float km,miles;
        System.out.print("Enter kilometers: ");
        km=s.nextInt();
        miles=km/1.609344f;
        System.out.println(km+" Km = "+miles+" Miles");
    }
}
