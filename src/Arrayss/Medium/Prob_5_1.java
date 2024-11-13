package Arrayss.Medium;

public class Prob_5_1 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(JayBhim(arr));
    }
    public static int JayBhim(int[] arr){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i] - min);
        }
        return max;
    }
}
