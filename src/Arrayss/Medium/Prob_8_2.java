package Arrayss.Medium;

import java.util.HashSet;
import java.util.Set;

public class Prob_8_2 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 7, 6, 9, 10, 11, 12, 13};
        int ans = counter(arr);
        System.out.println(ans);
    }
    public static int counter(int[]arr) {
        int n = arr.length;
        Set<Integer> st = new HashSet<>();
// Add element in set
        for (int i = 0; i < n; i++) {
            st.add(arr[i]);
        }

        int longest = 1;
        for (int it : st) {
            if (!st.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (st.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
