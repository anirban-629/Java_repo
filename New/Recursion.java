public class Recursion{
    int factorial(int x){
        if(x==1 || x==0){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }
    }

    public static void main(String[] args) {
    Recursion obj=new Recursion();
    int result=obj.factorial(5);
    System.out.println(result);    
    }
}