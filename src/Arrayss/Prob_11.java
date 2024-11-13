package Arrayss;

public class Prob_11 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1,1,1};
        int n = arr.length;
        System.out.println("The maximum times one appears is :"+sort(arr,n));
    }

    public static int sort(int[]arr , int n){
        int count = 0;
        for (int i = 0; i <n ; i++) {
            if (arr[i]==1){
                count++;
            }else{
                count=0;
            }
        }
        return count;
    }
}
