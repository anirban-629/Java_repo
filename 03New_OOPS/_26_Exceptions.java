import java.util.Scanner;

public class _26_Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int a, b;

        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 10;

        try {
            System.out.println("Enter a index of array element: ");
            a = sc.nextInt();
            System.out.println("Enter a Number to divide with array element: ");
            b = sc.nextInt();
            System.out.println(arr[a] / b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurd!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("OTHER : ");
            System.out.println(e);
        }

        sc.close();
    }
}
