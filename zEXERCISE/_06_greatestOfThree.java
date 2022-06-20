public class _06_greatestOfThree {
    public static void main(String[] args) {
        int a = 5000;
        int b = 5000;
        int c = 5000;
        if (a > b && a > c) {
            System.out.println("A > (B,C)");
        } else if (b > a && b > c) {
            System.out.println("B > (A,C)");
        } else if (c > b && c > a) {
            System.out.println("C > (A,B)");
        }
        else{
            System.out.println("A=B=C");
        }
    }
}
