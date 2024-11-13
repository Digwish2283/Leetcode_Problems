package Searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int key = 8;
        System.out.println(search(arr,key));
    }

    public static int search(int []arr, int key){
        int n= arr.length;
        int low = arr[0];
        int high = arr[n-1];
        while (low <= high) {
                int mid = low + (high-low)/2;

                if (key<mid){
                    high = mid-1;
                }
                else if (key>mid) {
                    low = mid+1;
                }
                else if (mid==key) {
                    return mid-1;
                }
        }
        return -1;
    }
}
