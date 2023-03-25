import java.util.Scanner;
public class Strings_Introduction {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        char c='a';

        String s="anirban";
        System.out.println(s);
        String s1=new String("anirban");
        System.out.println(s1);

        System.out.printf("a =%d\n",a);
        System.out.format("b =%d\n",b);
        System.out.printf("c =%c\n",c);

        Scanner s2=new Scanner(System.in);
        String str=s2.nextLine();
        System.out.println(">> "+str);
        System.out.printf(">> %s",str);
        s2.close();
    }    
}
