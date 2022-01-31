package recursion2;

public class QuickSort {

    private static int parition(int[] arr, int startIndex, int endIndex) {
        //1. assume pivot element at start index
        int pivot = arr[startIndex];

        //count to place pivot at current position
        int count = 0;

        //2. find pivot correct position
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        //3. place pivot at it correct position
        int pivotPos = startIndex + count;
        arr[startIndex] = arr[pivotPos];
        arr[pivotPos] = pivot;

        //4. Ensure towards left less than equal to pivot element and towards right greater than pivot element
        int i = startIndex;
        int j = endIndex;
        while (i <= pivotPos && j >= pivotPos) {
            if (arr[i] <= arr[pivotPos]) {
                i++;
            } else if (arr[j] > arr[pivotPos]) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // 5. Return pivot position for partitioning the array
        return pivotPos;
    }

    private static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivotPosition = parition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivotPosition - 1);
        quickSort(arr, pivotPosition + 1, endIndex);
    }

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 3, 5, 9, 10, 7, 8};
        quickSort(arr);
        for (var val : arr) {
            System.out.print(val + " ");
        }
    }
}
