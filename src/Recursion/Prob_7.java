package Recursion;
public class Prob_7 {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        reverseArray(arr);

    }

    //Function to print array
    static void printArray(int[] arr) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Function to reverse array
    static void reverseArray(int[] arr) {
        int p1 = 0, p2 = arr.length - 1;
        while (p1 < p2) {
            int tmp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = tmp;
            p1++;
            p2--;
        }
        printArray(arr);
    }
}
