package Searching;

import java.util.ArrayList;

public class Peak {
    public static void main(String[] args) {
        int[] arr = {7,8,9,5,4,3,2,1};
        int n = arr.length;
        int ans = peaks(arr,n);
        System.out.println("The peak ele from the given array is :"+ans);
    }
    public static int peaks(int[] arr,int n){

        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        int low = 1 , high = n-2;


        while(low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if (arr[mid] < arr[mid-1]){
                high = mid-1;
            }
            else {
                low = mid +1;
            }
        }
        return 0;
    }
}
