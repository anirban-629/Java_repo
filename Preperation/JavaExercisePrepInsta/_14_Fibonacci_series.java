public class _14_Fibonacci_series {

    static int n1 = 0, n2 = 1, temp;

    public static void fib(int n) {
        if (n > 0) {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            System.out.print(temp + ", ");
            fib(n - 1);
        }
    }

    public static void main(String[] args) {
        int n=5;
        System.out.print(n1+", "+n2+", ");
        fib(n);
    }
}
