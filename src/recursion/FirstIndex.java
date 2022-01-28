package recursion;

public class FirstIndex {
    private static int indexOfNumber(int[]arr, int startIndex, int search){
        if(startIndex == arr.length-1){
            return -1;
        }
        if(arr[startIndex] == search){
            return startIndex+1;
        }
        return indexOfNumber(arr, startIndex+1, search);
    }

    static int indexOfNumber(int[] arr, int search){
        return indexOfNumber(arr, 0, search);
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 1, 5, 8, 1};
        System.out.println(indexOfNumber(arr, 1));
    }
}
