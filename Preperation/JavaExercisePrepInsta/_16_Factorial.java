public class _16_Factorial {
    public static int fact(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
