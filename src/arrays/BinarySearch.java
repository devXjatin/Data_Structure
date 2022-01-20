package arrays;

public class BinarySearch {
    //method to find search element using binary search
    static int binarySearch(int[] arr, int searchElement){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] ==searchElement){
                return mid+1;
            }else if(arr[mid] < searchElement){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 10, 25, 30, 33, 37};
        System.out.println(binarySearch(arr, 30));
    }
}
