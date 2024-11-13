package Arrayss;

public class Prob_13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,5};
        int n = arr.length;
        int key = 4;
        System.out.println("The longest subarray is :"+subarray(arr,key,n));
    }

    public static int subarray(int[] arr, int key,int n ) {
        int length = 0;
        for (int i = 0; i <n ; i++) {

            for (int j = i; j <n ; j++) {
                //sum
                long sum = 0;
                //to add all the sum of sub arr
                for (int l = i; l <=j ; l++) {
                    sum+=arr[l];
                }
                //condition
                if (sum == key) {
                    length = Math.max(length, j - i + 1);
                }

            }

        }

        return length;
    }
}
