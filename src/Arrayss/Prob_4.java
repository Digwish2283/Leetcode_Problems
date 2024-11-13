package Arrayss;

public class Prob_4 {
    static int isSorting(int[] arr, int n){
        int i = 0;
        for (int j = 1; j <n ; j++) {
            if (arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,6};
        int n = 8;
        int k = isSorting(arr,n);
        System.out.println("Sorted array :");

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
