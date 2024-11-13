package Arrayss.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob_8_1 {
    public static void main(String[] args) {
        int[] a = {0, 1, 1, 2};
        int ans = toss(a);
        System.out.println(ans);
    }

    public static int toss(int[] a) {
        Arrays.sort(a);
        int count = 1;

        for (int i = 1; i <a.length ; i++) {
            if (a[i-1]==a[i]-1){
                count++;
            }
        }


        return count;
    }
}
