package Arrayss.Medium;

public class Prob_3 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int n = arr.length;
        int s = n/2;
        System.out.println(majority(arr,n,s));
    }
    public static int majority(int[] arr , int n, int s ){
        int count = 0;
        for (int i = 0; i < n; i++) {

            for (int j =0; j <n ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
                if (count>s){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
