package Arrayss;

public class Prob_10 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;
        misisng(arr,n);
    }

    public static void misisng(int[] arr,int n){
        int sum = n*(n+1)/2;
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
        }
        int ans = sum - arr_sum;
        System.out.println("Your missing element is :"+ans);
    }
}
