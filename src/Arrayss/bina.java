package Arrayss;

public class bina {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 4;  // Element to search
        System.out.println(find(k, arr, n));
    }

    public static int find(int k, int[] arr, int n) {
        int low = 0;
        int high = n - 1;  // Correctly set the upper boundary to n-1

        while (low <= high) {
            int mid = (low + high) / 2;  // Recalculate mid in each iteration

            // Compare k with the middle element of the array
            if (arr[mid] == k) {
                return mid;  // Element found
            } else if (arr[mid] < k) {
                low = mid + 1;  // Search in the right half
            } else {
                high = mid - 1;  // Search in the left half
            }
        }
        return -1;  // Element not found
    }
}
