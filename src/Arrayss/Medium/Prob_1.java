package Arrayss.Medium;

public class Prob_1 {
    public static void main(String[] args) {
        int[] arr = {2,1,13,5};
        int n = arr.length;
        int key = 14;
        System.out.println(two_sum(arr,n,key));
    }

    public static String two_sum(int[] arr , int n , int key){
        int sum = 0;
        int i = 0 ;
        int j = 1;
        for (i = 0; i <n ; i++) {
            for (j = i+1; j < n; j++) {
                sum+= arr[i]+ arr[j];
                    if (arr[i]+arr[j]==key){
                        System.out.println( i + "," +j);
                        return "yes";
                    }
                }
        }

        return "Fuck";
    }
}
