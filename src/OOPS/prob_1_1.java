package OOPS;

public class prob_1_1 {
    public static void tsum(int[] arr, int n, int target){
        int left = 0;
        int right = n-1;
        while (left<right){
            if(arr[left]+arr[right]==target){
                System.out.println("the indexes are: "+left+" "+right);
            }else if(arr[left]+arr[right]<target){
                left++;
            }else{
                right--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int n = arr.length;
        int target = 14;
        tsum(arr,n,target);
    }
}
