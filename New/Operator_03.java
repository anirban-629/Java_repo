public class Operator_03 {
    public static void main(String[] args) {
        /* int a=10;
        int b=5;
        System.out.println(10 & 5);
        System.out.println(a<b);
        System.out.println(10*23+35/5*10);*/

        int a=10;

        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

        int b=10;
        System.out.println(b--);
        System.out.println(b);
        System.out.println(--b);

        int a1=10;
        int a2=a1++;
        System.out.println(a1);
        System.out.println(a2);

        char a4 ='a';
        System.out.println(a4++);
        System.out.println(a4);
    }
}
