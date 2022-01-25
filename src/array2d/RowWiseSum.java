package array2d;

public class RowWiseSum {

    //calculate the row sum of 2d-array
    static int[] rowSum(int[][]arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int[] sum = new int[cols];
        for (int i = 0; i < rows; i++) {
            int tempSum= 0;
            for (int j = 0; j < cols; j++) {
                tempSum+=arr[i][j];
            }
            sum[i] = tempSum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr2d = {{1,2,3},{4,5,6},{7,8,9}};
        int[] sum= rowSum(arr2d);
        for(var val: sum){
            System.out.print(val+" ");
        }
    }
}
