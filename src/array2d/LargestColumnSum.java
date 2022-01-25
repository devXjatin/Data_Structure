package array2d;

public class LargestColumnSum {

    //calculate the largest column sum of 2d-array
    static int largestColumnSum(int[][]arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int largestSum = 0;
        for (int i = 0; i < rows; i++) {
            int tempSum= 0;
            for (int j = 0; j < cols; j++) {
                tempSum+=arr[j][i];
            }
            largestSum = Math.max(largestSum, tempSum);
        }
        return largestSum;
    }
    public static void main(String[] args) {
        int[][] arr2d = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(largestColumnSum(arr2d));

    }
}
