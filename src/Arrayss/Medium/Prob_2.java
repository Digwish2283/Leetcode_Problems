package Arrayss.Medium;

import java.util.ArrayList;

public class Prob_2 {
    public static void main(String[] args) {
        int[] a = {1,0,2,1,2,0,1,0,2};
        fuck(a);
    }
    public static void fuck(int[] a){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length;
// for 0s
        for (int i = 0; i <n ; i++) {
            if (a[i]==0){
                ans.add(a[i]);
            }
        }
// for 1s
        for (int i = 0; i <n ; i++) {
            if (a[i]==1){
                ans.add(a[i]);
            }
        }
//for 2s
        for (int i = 0; i <n ; i++){
            if (a[i]==2){
                ans.add(a[i]);
            }
        }
        System.out.println(ans);
    }
}
