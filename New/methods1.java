public class methods1 {

    static int sum1(int ...arr){
        //    ... arr -> int [] arr
        int result =0;
        for(int ele:arr){
            result+=ele;
        }
        return result;
    }

    static int sum2(int x, int ...arr){
        int result=x;
        for(int ele:arr){
            result+=ele;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum1 "+sum1(10,20,30,40,50,60,70,80,90,100));
        System.out.println("Sum2 "+sum2(10,20,30,40,50,60,70,80,90,100,110));
    }
}
