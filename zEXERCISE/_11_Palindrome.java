public class _11_Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int rem = 0, temp=num, revNum=0;
        while(temp!=0){
            rem=temp%10;
            temp/=10;
            revNum=revNum*10+rem;
        }
        if(num==revNum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
