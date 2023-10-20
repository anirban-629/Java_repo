import java.util.Arrays;

public class SecondSmallest {

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}