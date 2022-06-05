import java.util.Scanner;
public class Check_presence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        int [] arr={10,20,30,40,50};
        System.out.print("Enter the element: ");
        int ele=sc.nextInt();

        for(int a:arr){
            if(a==ele){
                flag=true;
            }
        }
        if(flag){
            System.out.println("Found");
        }        
        else{
            System.out.println("Not 6Found");
        }
        sc.close();
    }
}
