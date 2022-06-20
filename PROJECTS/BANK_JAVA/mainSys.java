import java.io.File;
import java.util.Scanner;

class customer {
    public void cust() {
        Scanner sc = new Scanner(System.in);
        System.out.println("CUSTOMER");
        int nwOrOld = customerNewOrExisting();
        if (nwOrOld == 1) {
            System.out.println("New CUSTOMER");
        } else {

            System.out.println(verifyingCustomer());
        }
    }

    public int customerNewOrExisting() {
        Scanner sc2 = new Scanner(System.in);
        int a;
        System.out.println("New Customer       --->> 1");
        System.out.println("Existing Customer  --->> 2");
        System.out.print("----->> ");
        a = sc2.nextInt();
        sc2.close();
        return a;
    }

    public static boolean verifyingCustomer() {
        Scanner sc1=new Scanner(System.in);
        System.out.print("Please Kindly Enter your Security code: ");
        String code = sc1.nextLine();
        sc1.close();
        boolean flag = false;
        String str2;
        File nFile = new File("usernamePass.txt");
        try {
            Scanner sc = new Scanner(nFile);
            while (sc.hasNextLine()) {
                str2 = sc.nextLine();
                if (str2.startsWith(code)) {
                    // System.out.println(str2);
                    flag = true;
                }
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}

public class mainSys {

    public static void greet() {
        System.out.println("\t\t\t\t\t\t\t\t<<<<----::::WELCOME TO BANK JAVA::::---->>>>\n\n\n");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        greet();

        int cstmrOrstf;
        System.out.println("CUSTOMER  --->> 1");
        System.out.println("STAFF     --->> 2");
        System.out.print("----->> ");
        cstmrOrstf = sc.nextInt();

        if (cstmrOrstf == 1) {
            customer c = new customer();
            c.cust();
        } else {
            System.out.println("STAFF");
        }
        sc.close();
    }
}
