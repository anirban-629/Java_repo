public class _35_Digit_count {
    public static void main(String[] args) {
        int a=100000;
        int count=0;
        int copy=a;
        while(copy!=0){
            count=count+1;
            copy/=10;
        }
        System.out.println(count);
    }
}
