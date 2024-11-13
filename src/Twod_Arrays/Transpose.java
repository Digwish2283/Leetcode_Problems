package Twod_Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        trsnps(matrix);
    }
    public static int[][] trsnps(int[][]matrix){

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] ans = new int[col][row];

        for (int i = 0; i<row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.println(ans[j][i] = matrix[i][j]);
            }
            System.out.println("--------");
        }

        return ans;
    }
}
