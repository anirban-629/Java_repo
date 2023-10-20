
public class _25_HCF {
    public static void main(String[] args) {
        int a = 15, b = 60, hcf = 0;
        for (int i = 1; i < a || i < b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + a + " and " + b + " is : " + hcf);
    }
}