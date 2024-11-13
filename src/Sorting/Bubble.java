package Sorting;

public class Bubble {
    public static void main(String[] args) {
       int[] arr = {13, 46, 24, 52, 20, 9};
       sort(arr);
    }
    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = n-1; i >=1 ; i--) {
            for (int j = 0; j <=i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting :");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
