package Searching;

public class CountKr {
    public static void main(String args[]) {
        int[] arr = {1,2,3,3,3,3,4,5,6};
        int k = 3;
        int answer = finale(arr,k);
        System.out.println("The no of time "+k+" has occured is "+answer);
    }

    public static int countFirst(int[] arr,int k ){

        int low = 0,high = arr.length-1;
        int first = -1;

        while (low<=high){

            int mid = low+(high-low)/2;

            if (arr[mid]==k){
                first = mid;

                high = mid - 1;
            }
            else if (arr[mid]<k) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return first;
    }
    public static int countlast(int[] arr , int k){

       int low = 0 , high = arr.length-1;
       int last = -1;

       while(low<=high){
           int mid = low + (high - low)/2;

           if (arr[mid]==k){
               last = mid;

               low = mid+1;
           }
           else if (arr[mid]<k) {
               low = mid+1;
           }
           else {
               high = mid -1;
           }
       }
        return last;
    }
    public static int[] firstlast(int[] arr,int k){
        int First = countFirst(arr, k);
        if (First==-1) return new int[] {-1,-1};
        int Last = countlast(arr, k);
        return new int[] {First,Last};
    }
    public static int finale(int[] arr , int k){

        int[] ans = firstlast(arr, k);
        if (ans[0]==-1) return 0;

        return (ans[1]-ans[0]+1);
    }
}