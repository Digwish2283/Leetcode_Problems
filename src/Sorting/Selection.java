package Sorting;

public class Selection {
    public static void main(String[] args) {
       int[] arr ={13, 46, 24, 52, 20, 9};
       sort(arr);
    }
    public static void sort (int [] arr){
        int n = arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int mini = i;
            for (int j = i+1; j <n ; j++) {
                if (arr[mini]>arr[j]){
                    mini = j;
                    //swap
                    int temp = arr[mini];
                    arr[mini] = arr[i];
                    arr[i] = temp;

                }
            }
        }
        System.out.println("Array after sorting :");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
