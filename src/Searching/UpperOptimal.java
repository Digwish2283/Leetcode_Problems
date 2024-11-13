package Searching;

public class UpperOptimal {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int x =2;
        System.out.println(opt(arr,x));
    }
    public static int opt(int[] arr , int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid;
        int ans = 0;
        while(low <= high) {
            mid = low + (high - low)/2;

            if (arr[mid]>x){
                ans =  mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
}
