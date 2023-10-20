public class SumOfElements {
    static int arrInd, sum;

    public static int sumArr(int arr[]) {
        if (arrInd == arr.length)
            return sum;
        else {
            sum += arr[arrInd++];
            return sumArr(arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        System.out.println(sumArr(arr));
    }
}
