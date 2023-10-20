import java.util.Arrays;

public class FirstSecondAscDsc {

    static int[] customizedSort(int arr[]) {
        Arrays.sort(arr, 0, arr.length / 2);
        Arrays.sort(arr, arr.length / 2 + 1, arr.length - 1);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int arr2[] = customizedSort(arr);
        for (int ele : arr2) {
            System.out.print(ele + " ");
        }

    }
}
