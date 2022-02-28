package arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 3, 4, 2};
        bubbleSort(arr);
        for (var val :
             arr) {
            System.out.print(val+" ");
        }
    }
}
