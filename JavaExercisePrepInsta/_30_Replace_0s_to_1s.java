
public class _30_Replace_0s_to_1s {
    public static int reverse(int n){
        int rem = 0;
        int temp=n;
        int revNum=0;
        while(temp!=0){
            rem=temp%10;
            temp/=10;
            revNum=revNum*10+rem;
        }
        return revNum;
    }
    public static int replace(int n){
        int a=n,rem,num=0,one;
        while(a!=0){
            rem=a%10;
            if(rem==0){
                num=(num*10)+1;
            }
            else{
                num=(num*10)+rem;
            }
            a/=10;
        }
        return reverse(num);
    }
    public static void main(String[] args) {
        int a = 106701;
        System.out.println(replace(a));
    }
}
