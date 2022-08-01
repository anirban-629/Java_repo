
public class _22_HarshadNumber {
    public static void main(String[] args) {
        int n = 18, rem, sum = 0;
        int temp = n;
        while (temp != 0) {
            rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        if (n % sum == 0) {
            System.out.println("HARSHAD");
        } else {
            System.out.println("NOT HARSHAD");
        }
    }
}
