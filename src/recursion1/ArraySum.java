package recursion1;

public class ArraySum {
    static int sumOfArray(int[] arr, int startIndex){
        if(startIndex == arr.length){
            return 0;
        }
        return arr[startIndex]+sumOfArray(arr, startIndex+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4 ,5};
        System.out.println(sumOfArray(arr, 0));
    }
}
