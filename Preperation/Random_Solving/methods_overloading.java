public class methods_overloading {
    static int foo(int a){
       return a*a; 
    }
    static int foo(int a,int b){
       return a*b; 
    }
    static int foo(int a, int b, int c){
       return a*b*c; 
    }
    public static void main(String[] args) {
        System.out.println(foo(10));
        System.out.println(foo(10,20));
        System.out.println(foo(10,20,30));
    }       
}
