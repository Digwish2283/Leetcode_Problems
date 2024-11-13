package Arrayss.Medium;

public class Prob_5 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(sortttt(arr));
    }
    public static int sortttt(int[] arr){
        int n = arr.length;
        int maxPro = 0;
        for (int i = 0; i <n ; i++){
            for (int j = i+1; j <n ; j++){
                if (arr[j] > arr[i]){
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
        return maxPro;
    }
}
