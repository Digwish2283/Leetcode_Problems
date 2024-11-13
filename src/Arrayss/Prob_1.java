package Arrayss;
//
//public class Prob_1 {
//    static void large(int arr[],int n){
//        int max= arr[0];
//        for (int i = 0; i <= arr.length/2 ; i++) {
//            for (int j = arr.length-1; j <n/2 ; j++) {
//                if (arr[i]>arr[j]){
//                    max = arr[i];
//                }else {
//                    max = arr[j];
//                }
//            }
//        }
//        System.out.println("The max element from the array is :"+max);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,4,2,9,7,3,5};
//        int n = arr.length;
//        large(arr,n);
//    }
//}

public class Prob_1 {
    static void large(int[] arr, int n){
        int largest = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,9,7,3,5};
        int n = arr.length;
        large(arr,n);
    }
}

