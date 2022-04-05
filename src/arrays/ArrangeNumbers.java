package arrays;

public class ArrangeNumbers {
    //method to arrange the numbers
    static void arrangeNumbers(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int number = 1;
        while(start < end){
            arr[start] = number;
            number++;
            start++;
            arr[end] = number;
            number++;
            end--;

            if(start == number){
                arr[start] = number;
            }
        }
    }

    //method to print array
    static void printArray(int[] arr) {
        for (var val : arr) {
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[6];
        arrangeNumbers(arr);
        printArray(arr);
    }
}
