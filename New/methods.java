public class methods {
    static int sum(int a,int b){
        return a+b;
    }
    static void arr(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+","+b);
    }
    public static void main(String[] args) {

        System.out.println("\nsum of 10 and 20: "+sum(10,20));
        
        System.out.println("ARRAY PRINT");
        
        int [] arr={10,20,30,40,50};
        arr(arr);
        
        System.out.println("SWAP");
        int a=10,b=20;
        System.out.println(a+","+b);
        
        swap(10, 20);

    }
}
