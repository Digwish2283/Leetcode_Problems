package Arrayss;

public class prob14_1 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int key = 10;
        System.out.println("The maximum subarray for "+key+" is : "+sort(arr,key));
    }
    public static int sort(int[] arr, int key){
        int left = 0 , right = 0;
        int n = arr.length;
        int Maxlen = 0;
        long sum = arr[0];

        while(right<n){

            while (left<=right && sum>key){
                sum -= arr[left];
                left++;
            }

            if (sum==key){
                Maxlen = Math.max(Maxlen,right-left+1);
                right++;
            }

            right++;

            if (right<n){
                sum+=arr[right];
            }
        }


        return Maxlen;
    }
}
