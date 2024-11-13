package Twod_Arrays;

class Solution1 {
    public static int rangeSum(int arr[], int n, int lower, int upper) {
        int count_sum = 0;

        // Calculate the cumulative sum
        int[] cumSum = new int[n + 1];
        cumSum[0] = 0;
        for (int i = 1; i <= n; i++) {
            cumSum[i] = cumSum[i - 1] + arr[i - 1];
        }

        // Count the number of valid sums
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int sum = cumSum[j] - cumSum[i];
                if (sum >= lower && sum <= upper) {
                    count_sum++;
                }
            }
        }
        return count_sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -3, 5, 2, 52, -5};
        int n1 = arr1.length;
        int lower1 = -2;
        int upper1 = 6;
        System.out.println(rangeSum(arr1, n1, lower1, upper1)); // Output: 8


    }
}