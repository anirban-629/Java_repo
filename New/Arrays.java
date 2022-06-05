import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // 1. Declaration + memory allocation

        // int [] numbs;
        // numbs =new int[5];

        // 2. Declaration +memory allocation+ initialization

        // int [] numbs={10,20,30,40,50};
        // System.out.println(numbs[4]);
        Scanner sc = new Scanner(System.in);
        int[] numb = new int[5];
        for (int i = 0; i < numb.length; i++) {
            numb[i] = sc.nextInt();
        }
        System.out.println("print");
        for (int i = 0; i < numb.length; i++) {
            System.out.println(numb[i]);
        }
        sc.close();
    }
}
