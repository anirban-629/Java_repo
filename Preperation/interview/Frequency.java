import java.util.Arrays;

public class Frequency {
    static int n, i;

    static int[] FrequencyArray(int arr[], int n) {
        if (i == 0) {
            final int[] fArr = new int[n + 1];
            Arrays.fill(fArr, 0);
        }
        if (i == n)
            return arr;
        else {
            fArr[arr[i++]]++;
            return FrequencyArray(arr, n);
        }
        return farr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
                19, 20, 21, 22, 23, 24, 25, 26, 27,
                28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43 };
        Arrays.sort(arr);
        int frequency[] = FrequencyArray(arr, arr[arr.length - 1]);
        System.out.println(frequency.length + " " + frequency[0]);
        // for (int ele : frequency) {
        // // System.out.print(ele + " ");
        // }
    }
}
