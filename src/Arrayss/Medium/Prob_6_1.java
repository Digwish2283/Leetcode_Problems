package Arrayss.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prob_6_1 {
    public static void main(String[] args) {
        // Array Initialization.
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,-3,-1,4,-5));
        ArrayList<Integer> answer = RearrangebySign(A);
        System.out.println(answer);
    }

    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
        int n = A.size();

        // Define array for storing the ans separately.
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i <n ; i++) {
            if (A.get(i)<0){
                ans.set(negIndex,A.get(i));
                negIndex+=2;
            }
            else {
                ans.set(posIndex,A.get(i));
                posIndex+=2;
            }
        }
        return ans;
    }
}
