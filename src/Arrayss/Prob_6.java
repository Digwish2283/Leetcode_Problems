package Arrayss;

import java.util.ArrayList;

public class Prob_6 {
    public static int[] moveZeros(int n, int []arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            if (arr[i]!= 0){
                temp.add(arr[i]);
            }

        }
        int nz = temp.size();

        for (int i = 0; i <nz ; i++) {
            arr[i]=temp.get(i);
        }

        for (int i = nz; i <n ; i++) {
            arr[i]=0;
        }
    return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,0,2,0,0,5};
        int n = arr.length;
       int[] ans = moveZeros(n,arr);
        for (int i = 0; i <n ; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println(" ");
    }
}
