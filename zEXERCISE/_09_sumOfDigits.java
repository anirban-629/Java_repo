public class _09_sumOfDigits {
    public static void main(String[] args) {
        int num=12345;
        int temp=num,sum=0,rem;
        while(temp!=0){
            rem=temp%10;
            System.out.println("Remainder --> "+rem);
            sum+=rem;
            temp/=10;
        }
        System.out.println(sum);
    }
}
