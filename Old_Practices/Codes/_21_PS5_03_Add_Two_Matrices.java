package Old_Practices.Codes;
import java.util.Scanner;
public class _21_PS5_03_Add_Two_Matrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] mat1=new int[2][3];
        int [][] mat2=new int[2][3];
        int [][] result=new int[2][3];

        System.out.println("Enter data of 1st Matrix");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print("["+i+"]"+"["+j+"]-------> ");
                mat1[i][j]=sc.nextInt();
            }
            System.out.println();
        }

//        System.out.println("Enter data of 2nd Matrix");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print("["+i+"]"+"["+j+"]-------> ");
                mat1[i][j]=sc.nextInt();
            }
            System.out.println();
        }
//
//        Addition
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
//        Result
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("\r");
        }
    }
}
//NOT WORKING
