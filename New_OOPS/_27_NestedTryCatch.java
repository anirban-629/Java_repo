public class _27_NestedTryCatch {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 10;
        int ind=10;
        try {
            System.out.println("Entering nested Try ->");
            try {
                System.out.println("Enterd Nested try");
                System.out.println("arr[ind]: "+arr[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ARRAY INDEX OUT OF BOUND : ");
                System.out.println(e);
            }
        } catch (Exception e) {
            // This will never be executed as the previous is handled.
            System.out.println("Exception: "+e);
        }
    }
}
