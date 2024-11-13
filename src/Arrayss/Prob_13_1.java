package Arrayss;

public class Prob_13_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,4,5};
        int n = arr.length;
        int k = 3;
        System.out.println(sumsub(arr,k,n));
    }

    public static int sumsub(int[] arr, int k, int n){
        int length = 0;
        for (int i = 0; i <n ; i++) {

            for (int j = i; j <n ; j++) {
                long sum = 0;
                //for summation
                for (int l = i; l <=j ; l++) {
                    sum += arr[l];
                }

                //condition
                if (sum == k){
                    length = Math.max(length,j-i+1);
                }
            }
        }

        return length;
    }
}
