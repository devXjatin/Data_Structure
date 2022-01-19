package arrays;

public class SwapAlternate {
    //method to swap the alternate
    static void swapAlternate(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length-1; i=i+2) {
            temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
    }

    //method to print array
    static void printArray(int[] arr){
        for(var val: arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 3, 10, 15, 20};
        swapAlternate(arr);
        printArray(arr);
    }
}
