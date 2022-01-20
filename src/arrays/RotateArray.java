package arrays;

public class RotateArray {
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static void reverse(int[] arr, int start, int end){
        while(start< end){
            //swap the array
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void rotateArray(int[] arr, int d){
        //reverse the array from 0 to 1 index.
       reverse(arr, 0, d-1);

       //reverse array from 2 to n-1 index.
       reverse(arr, d, arr.length-1);

       //reverse the whole array.
       reverse(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        rotateArray(arr, 2);
        for (var val:arr
             ) {
            System.out.print(val+" ");

        }
    }
}
