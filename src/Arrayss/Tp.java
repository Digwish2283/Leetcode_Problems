package Arrayss;

import java.util.ArrayList;
import java.util.HashMap;

public class Tp {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6,7};
        System.out.println(ans(arr1, arr2));
    }
    public static ArrayList ans(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i <arr1.length ; i++) {
            map.put(arr1[i],true);
        }

        for (int i = 0; i <arr2.length ; i++) {
            map.put(arr2[i],true);
        }

        ArrayList<Integer> answer = new ArrayList<>(map.keySet());
        return answer;
    }
}
