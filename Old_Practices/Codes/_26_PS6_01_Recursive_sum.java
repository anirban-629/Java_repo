package Old_Practices.Codes;

public class _26_PS6_01_Recursive_sum {
    static int sum(int n){
        if (n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    static int sum1(int ...arr){
        int n= arr.length;
        int sum=0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(sum(n));
        System.out.println(sum1(1,2,3,4,5,6,7,8,9,10));
    }
}
