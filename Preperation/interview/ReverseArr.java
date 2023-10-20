public class ReverseArr {
    static int ind;

    public static int[] swapInArr(int[] arr, int ind, int length) {
        int temp = arr[ind];
        arr[ind] = arr[length - ind - 1];
        arr[length - ind - 1] = temp;
        return arr;
    }

    public static int[] reverseArr(int arr[]) {
        if (ind == arr.length / 2) {
            return arr;
        } else {
            int swappedArr[] = swapInArr(arr, ind, arr.length);
            ind++;
            return reverseArr(swappedArr);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int rev[] = reverseArr(arr);
        for (int ele : rev) {
            System.out.println(ele);
        }

    }
}
