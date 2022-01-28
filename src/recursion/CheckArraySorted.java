package recursion;

public class CheckArraySorted {
    static boolean isSortedArray(int[] arr){
        if(arr.length <=1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int[] smallInput = new int[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
            smallInput[i-1] = arr[i];
        }
        return isSortedArray(smallInput);
    }

    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
        System.out.println(isSortedArray(arr));
    }
}
