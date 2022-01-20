package arrays;

public class SelectionSort {

    //method to sort the array
    static  void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int index = -1;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
                int temp = arr[index] ;
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 3, 4, 2};
        selectionSort(arr);
        for(var val : arr){
            System.out.print(val+" ");
        }
    }
}
