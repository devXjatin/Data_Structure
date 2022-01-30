package recursion2;

public class MergeSort {
    private static void mergeSortedArray(int[] arr, int start, int end){
        int size = end-start+1;
        int mid = (end+start)/2;
        int[] ans = new int[size];
        int i = start;
        int j = mid+1;
        int k =0;
        while(i<=mid && j<=end){
            if(arr[i]<= arr[j]){
                ans[k] = arr[i];
                i++;
                k++;
            }else{
                ans[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end){
            ans[k] = arr[j];
            j++;
            k++;
        }
        int m=0;
        for (int l = start; l <=end ; l++) {
            arr[l] = ans[m];
            m++;
        }


    }

    private static void mergeSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int mid = (end+start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr,mid+1, end);
        mergeSortedArray(arr, start, end);
    }
    static void mergeSort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 2, 1, 3, 5, 10, 9, 8};
        mergeSort(arr);
        for(var val:arr){
            System.out.print(val+" ");
        }
    }
}
