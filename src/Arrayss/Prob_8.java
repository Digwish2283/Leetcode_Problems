package Arrayss;

public class Prob_8 {

    static boolean findKey(int[] arr, int key){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==key) {
                System.out.println(i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,9,4};
        int key = 9;
        findKey(arr,key);
    }
}
