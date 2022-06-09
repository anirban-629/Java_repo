import java.util.Scanner;

class myException extends Exception {
    @Override
    public String toString() {
        // return super.toString() + "I'm toString()";
        return "I'm toString()";
    }

    @Override
    public String getMessage() {
        // return super.getMessage() + " I'm getMessage()";
        return "I'm getMessage()";
    }
}

public class _29_Exceptions_Custom {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 10) {
            try {
                throw new myException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace(); //-> throw the error line..
                System.out.println(e);
                System.out.println(e.toString());
            }
        }
        sc.close();
    }
}
