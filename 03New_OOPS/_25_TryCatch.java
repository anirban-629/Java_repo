import java.util.Scanner;

public class _25_TryCatch {
    public static void main(String[] args) {
        // synatx error:
        // int a=10;
        // c=a/b;

        // logical error
        // Need to implement by user but it must be set by user as like you want to implement odd numbers but logic written for even numbers

        // Runtime error
        // Suppose input needed integer and user gave string
        
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println(100/0);
        } catch (Exception e) {
            System.out.println(e);
        }

        try{
            int a=sc.nextInt();
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}
