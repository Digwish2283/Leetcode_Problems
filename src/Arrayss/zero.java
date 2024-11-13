package Arrayss;

import java.util.ArrayList;
import java.util.List;

public class zero {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        soo(arr,n);
    }
    public static void soo(int[] arr, int n){
        List<Integer> nzs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i]!=0){
                nzs.add(arr[i]);
            }
        }

        int nz = nzs.size();

        for (int i = 0; i < nz; i++) {
            arr[i] = nzs.get(i);
        }

        for (int i = nz; i < n ; i++) {
           arr[i] = 0;
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
