package arrays;

public class PairSum {

    //method to find pair of sum
    static void pairSum(int[] arr, int sum){
        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            while (j< arr.length){
                if(arr[i] + arr[j] == sum){
                    System.out.print("("+arr[i]+","+arr[j]+")"+" ");
                }
                j++;
            }

        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 6, 2, 5, 4, 3, 2};
        int sum = 7;
        pairSum(arr, sum);
    }
}
