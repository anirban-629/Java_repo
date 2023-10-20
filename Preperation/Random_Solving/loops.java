import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        // FOR
        System.out.print("FOR LOOP");
        for(int i=1;i<11;i++)
        {
            System.out.println(num+"X"+i+"="+num*i);
        }
        // WHILE
        System.out.println("WHILE LOOP");
        int j=1;
        while(j<=10){
            System.out.println(num+"X"+j+"="+num*j);
            j++;
        }
        // DO WHILE
        System.out.println("DO WHILE LOOP");
        int k=1;
        do {
            System.out.println(num+"X"+k+"="+num*k);
            k++;
        } while (k<=10);

        sc.close();
    }
}
