package recursion3;

public class BinarySearch {
    private static int binarySearch(int[]arr,int search, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = (end+start)/2;
        if(arr[mid] == search){
            return mid;
        }else if(arr[mid]> search){
            return binarySearch(arr, search, start, mid-1);
        }else{
            return binarySearch(arr, search, mid+1, end);
        }
    }
    static int binarySearch(int[]arr, int search){
        return binarySearch(arr,search, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 8};
        System.out.println(binarySearch(arr, 5));
    }
}
