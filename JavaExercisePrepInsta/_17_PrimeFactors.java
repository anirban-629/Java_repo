public class _17_PrimeFactors {
    public static boolean isPrime(int n){
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                return false; 
            }
        }
        return true;
    }
    public static void primeFactors(int n){
        for (int i = 2; i <=n; i++) {
            if(isPrime(i)){
                int x=n;
                while(x%i==0){
                    System.out.print(i+" ");
                    x/=i;
                }
            }
        }
    }
    public static void main(String[] args) {
        primeFactors(100);
    }
}
