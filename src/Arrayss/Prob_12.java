package Arrayss;

public class Prob_12 {
    public static void main(String[] args) {
        int[] arr = {2,4,4,5,3,5,5,3};
        System.out.println(sort(arr));
    }
    public static int sort(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i <n ; i++) {
            int num = arr[i];

            for (int j = 0; j <n ; j++) {
                if (num == arr[j]){
                    count++;
                }
            }
            if (count==1){
                return num;
            }
        }
        return -1;
    }
}
