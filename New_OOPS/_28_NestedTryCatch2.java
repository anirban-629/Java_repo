public class _28_NestedTryCatch2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        // int arr[] = new int[5];
        // arr[0] = 10;
        // arr[1] = 10;
        // arr[2] = 10;
        // int ind;
        // boolean flag = true;
        // while (flag) {
        //     System.out.println("Enter the index: ");
        //     ind = sc.nextInt();
        //     try {
        //         System.out.println("Entering to check...");
        //         try {
        //             System.out.println("arr[ind]= " + arr[ind]);
        //             flag = false;
        //         } catch (ArrayIndexOutOfBoundsException e) {
        //             System.out.println(e);
        //         } catch (Exception e) {
        //             System.out.println(e);
        //         }
        //     } catch (Exception e) {
        //         System.out.println("Never Reached Catch Statement");
        //     }
        // }

        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }

        sc.close();
    }
}
