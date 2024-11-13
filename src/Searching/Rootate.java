package Searching;

public class Rootate {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2, 3};
        int n = arr.length;
        int answer = mini(arr,n);
        System.out.println("The Array is rotated "+answer+" times");
    }
    public static int mini(int[] arr,int n){
        int low = 1, high = n-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if (arr[low]<=arr[mid]){
                if (ans>arr[low]) {
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;

            }   else {
                if (ans > arr[mid]){
                    ans = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
}
