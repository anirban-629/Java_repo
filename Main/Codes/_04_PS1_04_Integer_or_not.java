package Main.Codes;
import java.util.Scanner;
public class _04_PS1_04_Integer_or_not {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        boolean b=s.hasNextInt();
        System.out.println(b);
    }
}