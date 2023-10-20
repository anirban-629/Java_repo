package Main.Codes;
import java.util.Scanner;
public class _09_PS_Strings_03_Replacing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String letter="Hello <|name|>, Thanks alot..!";
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.println(letter.replace("<|name|>",name));
    }
}
