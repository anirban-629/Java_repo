import java.util.Scanner;

class exp extends Exception {
    @Override
    public String getMessage() {
        return "NotValid";
    }
}

public class _30_Exceptions_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age > 125) {
            try {
                throw new exp();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("Age is: "+age);
        }
    }
}
