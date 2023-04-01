import java.util.*;

public class temp {
    public static int binarysearch(int l, int arr[], int f, int s) {
        if (s > l) {
            return 0;
        } else {
            while (l - s == 1) {
                int mid = (s + l) / 2;
                if (arr[mid] == f) {
                    return mid;
                } else if (arr[mid] > f) {
                    s = mid + 1;
                } else if (arr[mid] < f) {
                    l = mid;
                } else {
                    return -1;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Enetr the element of the Array: ");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find: ");
        int f = sc.nextInt();
        int s = 0;
        int x = binarysearch(l, arr, f, s);
        {
            if (x == -1) {
                System.out.println("Element not found: ");
            } else {
                System.out.println("Element found at potion: " + x);
            }
        }
    }
}