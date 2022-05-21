package array2d;

public class BoundariesAndDiagonalSum {

    //calculate total sum of boundaries and diagonal
    static int boundraiesAndDiagonalSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int sum = 0;

        //calculate total sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //calculate diagonal sum
                if (i == j) {
                    sum += arr[i][j];
                }
                //calculate boundaries sum
                else {
                    sum += arr[i][j];
                }
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int[][] arr2d = {{1,2,3}, {4,5,6},{7,8,9}};
        System.out.println(boundraiesAndDiagonalSum(arr2d));
    }
}
