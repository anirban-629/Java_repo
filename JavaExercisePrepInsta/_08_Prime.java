public class _08_Prime {
    public static void main(String[] args) {
        int num=9;
        int count=0;
        if(num<2){
            System.out.println("Not Prime");
        }
        else if(num<0){
            System.out.println("NEGATIVE");
        }
        else{
            for (int i = 1; i <= num; i++) {
                if(num%i==0){
                    count+=1;
                }
            }
        }
        if(count>2){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
