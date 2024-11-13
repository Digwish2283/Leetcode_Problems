package Searching;

public class small {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int n = arr.length;
        int answer = mini(arr,n);
        System.out.println("The minimum element inthis array is :"+answer);
    }
    public static int mini(int[] arr,int n){
        int low = 1, high = n-1;
        int ans = Integer.MAX_VALUE;

        while(low<=high){
            int mid = low + (high-low)/2;

            if (arr[low]<=arr[mid]){
                ans = Math.min(ans,arr[low]);
                //eliminate left half
                low = mid + 1;

            }   else {
                ans = Math.min(ans,arr[mid]);
                //eliminate right half
                high = mid-1;
            }
        }


        return ans;
    }
}
