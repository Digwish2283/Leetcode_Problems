package Twod_Arrays;

public class Wave {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 10},
                {4, 5, 6, 11},
                {7, 8, 9, 12}
        };
        waving(arr);
    }
    public static void waving(int[][]arr){

        for (int c = 0; c < arr[0].length; c++) {
            //if even
            if (c%2==0){
                for (int r = 0; r < arr.length ; r++) {
                    System.out.print(arr[r][c]+" ");
                }
            }
            else {
                for (int r = arr.length-1; r>=0; r--) {
                    System.out.print(arr[r][c]+" ");
                }
            }
        }
    }
}
