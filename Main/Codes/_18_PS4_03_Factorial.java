package Main.Codes;

public class _18_PS4_03_Factorial {
    public static void main(String[] args) {
        int n=4,fact=1;

//        for (int i=1;i<=n;i++){
//            fact=fact*i;
//        }
        int i=1;
        while (i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial: "+fact);
    }
}
