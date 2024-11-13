package Arrayss.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob_7 {
    public static void main(String[] args) {
       int[] arr = {4,7,2,8,0};
       leader(arr);
    }
    public static void leader(int[] arr){
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n ; j++) {
                if (arr[i]>arr[j]){
                    ans.add(arr[i]);
                    i++;
                }else {
                    i++;
                }
            }

            if (i==arr.length-1) {
                ans.add(arr[arr.length - 1]);
            }
        }
        System.out.println(ans);;
    }
}
