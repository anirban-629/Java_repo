import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        // 1 Rock
        // 2 Paper
        // 3 Scissor

        Scanner sc = new Scanner(System.in);
        Random nr = new Random();
        while (true) {
            int comp = nr.nextInt(3);
            System.out.print("1 Rock\n2 Paper\n3 Scissor\n4 Exit: ");
            int user = sc.nextInt();
            if(user==4){
                System.out.print("BYE BYE..!");
                break;
            }
            else if (comp == user) {
                System.out.println("Draw\n");
            } else if (user == 1 && comp == 2 || user == 1 && comp == 3 || user == 3 && comp == 2) {
                System.out.println("User Wins\n");
            } else {
                System.out.println("Computer Wins");
            }
        }
        sc.close();
    }
}
