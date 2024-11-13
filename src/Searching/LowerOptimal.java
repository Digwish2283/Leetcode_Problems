package Searching;

public class LowerOptimal {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;
        System.out.println(opt(arr,x));
    }
    public static int opt(int[] arr, int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        int ans = 0;
        for (int i = 0; i <n ; i++) {

            mid = low + (high - low)/2;
            if (arr[mid]>=x){
                ans =  mid;
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }

        return ans;
    }
}
