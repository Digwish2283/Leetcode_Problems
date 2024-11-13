package Arrayss;

public class Sec_nd {
    public static void main(String[] args) {
         int[] arr = {3,6,4,2,1};
        System.out.println(Sec_min(arr));
    }

    public static int Sec_min (int[] arr) {
        int prev = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< min){
                prev = min;
                min = arr[i];
            } else if (arr[i]<prev && min!=arr[i]) {
                prev = arr[i];
            }
        }
        return prev;
    }
}
