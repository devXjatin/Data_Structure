package recursion;

public class LastIndex {
    private static int indexOfNumber(int[]arr, int startIndex, int search){

        if(startIndex == arr.length){
            return -1;
        }

        int smallAns = indexOfNumber(arr, startIndex+1, search);
        if(smallAns != -1 ){
            return smallAns;
        }
        if(arr[startIndex] == search) {
            return startIndex + 1;
        }else{
            return -1;
        }

    }

    static int indexOfNumber(int[] arr, int search){
        return indexOfNumber(arr, 0, search);
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 1, 5, 8, 1};
        System.out.println(indexOfNumber(arr, 1));
    }

}
