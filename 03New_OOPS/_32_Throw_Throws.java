// import java.util.Scanner;
class wrongInp extends Exception {
    @Override
    public String getMessage() {
        return "Wrong Input";
    }
}

public class _32_Throw_Throws {
    public static void main(String[] args) {
        int a = 10;
        // Scanner sc= new Scanner(System.in);
        if (a < 20) {
            try {
                // System.out.println(a);
                throw new wrongInp();
            } catch (wrongInp e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
