package Sorting;

public class Insertion {
    public static void main(String[] args) {
       int[] arr = {13, 46, 24, 52, 20, 9};
       sort(arr);
    }
    public static void sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("Array after sorting is :");
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
