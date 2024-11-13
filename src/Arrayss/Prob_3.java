package Arrayss;

public class Prob_3 {
    static boolean isSorted(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        System.out.println(isSorted(arr));
    }
}