package arrays;

//Sliding Window Technique

public class SumOfSubarray {
    /**
     * window size k = 3
     * find maximum in the array
     */

    static int maxSum(int[] arr, int k){
        //window size to find sum upto k element
        int windowSum = 0;

        //find maximum Sum of 3 pair group coz window size is 3
        int maxSum = 0;

        //Iterate the loop upto window size it will first element sum of array
        for (int i = 0; i < k; i++) {
            windowSum+= arr[i];
            maxSum = windowSum;
        }

        //Iterate the loop upto length of array and give sum including next element and remove the previous element
        for (int j = k; j < arr.length; j++) {

            //arr[j-k] is use to remove the previous element
            windowSum+= arr[j] - arr[j-k];

            //find maximum between windowSum and maxSum
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9, 10};
        System.out.println(maxSum(arr, 3));

    }
}
