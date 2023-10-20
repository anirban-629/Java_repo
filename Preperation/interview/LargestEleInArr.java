public class LargestEleInArr {
    static int largest = 0, smallest;

    public static int largetstNumberWithR(int arr[], int p) {
        if (p == arr.length)
            return largest;
        else {
            if (arr[p] > largest)
                largest = arr[p];
            return largetstNumberWithR(arr, p + 1);
        }
    }

    public static int largetstNumberWithoutR(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= largest)
                largest = arr[i];
        }
        return largest;
    }

    public static int smallestNumberWithR(int arr[], int p) {
        if (p == 0)
            smallest = arr[p];
        if (p == arr.length)
            return smallest;
        else {
            if (arr[p] <= smallest)
                smallest = arr[p];
            return smallestNumberWithR(arr, p + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { -100, -1, -1, -2, -4, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 100 };
        System.out.println(largetstNumberWithoutR(arr));
        System.out.println(largetstNumberWithR(arr, 0));
        System.out.println(smallestNumberWithR(arr, 0));
    }
}