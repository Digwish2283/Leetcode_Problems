package Arrayss.Medium;

import java.util.ArrayList;

public class Prob_6 {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,-4,-5,6};
        int n = arr.length;
        int[] ans = rearrange(arr,n);
        for (int i = 0; i <n ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] rearrange(int[] arr, int n){
        ArrayList<Integer> pos =new ArrayList<>();
        ArrayList<Integer> neg =new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i]>0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }

        for (int i = 0; i <n/2 ; i++) {

            arr[i*2] = pos.get(i);
            arr[i*2+1] = neg.get(i);
        }
        return arr;
    }
}
