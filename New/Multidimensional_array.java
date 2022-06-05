import java.util.Scanner;
public class Multidimensional_array{
    public static void main(String[] args) {
        int [][] arr=new int [100][100];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                System.out.print("arr["+i+"]["+j+"] : ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                System.out.println("arr["+i+"]["+j+"] : "+arr[i][j]);
            }
        }
        sc.close();
    }
}