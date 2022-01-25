package array2d;

public class LargestRowOrColumn {
    //calculate the row sum of 2d-array
    static void largestRowOrColumn(int[][]arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int index = -1;
        boolean isRow = true;
        int largestSum = Integer.MIN_VALUE;

        //Find largest in rows
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum+= arr[i][j];
            }
            if (rowSum > largestSum) {
                largestSum = rowSum;
                index = i;
            }
        }

        //Find largest in column
        for (int i = 0; i < rows; i++) {
            int colSum = 0;
            for (int j = 0; j < cols; j++) {
                colSum += arr[j][i];
            }
            if (colSum > largestSum) {
                isRow = false;
                largestSum = colSum;
                index = i;
            }
        }

        if(isRow){
            System.out.println("row: "+index+"   " + largestSum);
        }else{
            System.out.println("col: "+index+"  " + largestSum);
        }
    }
    public static void main(String[] args) {
        int[][] arr2d = {{1,2,3},{4,5,6},{7,8,9}};
        largestRowOrColumn(arr2d);
        }
}

