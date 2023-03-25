package Old_Practices.Codes;
import java.util.Scanner;
public class _13_PS3_01_Exam_Pass_Fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int phy,chem,math;
        float tot;
        System.out.print("Enter Physics Marks: ");
        phy=sc.nextInt();
        System.out.print("Enter Chemistry Marks: ");
        chem=sc.nextInt();
        System.out.print("Enter Mathematics Marks: ");
        math=sc.nextInt();
        tot=(phy+chem+math)/3;
        System.out.println("Total Percentage: "+tot);

        if (phy>=33 && chem>=33 && math>=33 && tot>=40){
            System.out.println("Passed");
        }
        else{
            System.out.println("Fail");
        }
    }
}
