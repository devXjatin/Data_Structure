package arrays;

public class LeftMostOccurrence {
    static int leftMostOccurence(int[]arr, int low, int high, int search){
        if(low> high){
            return -1;
        }
        int mid = low+(high-low)/2;
        if((arr[mid] == search) && (mid == 0 || arr[mid-1] != search)){
            return mid;
        }
        else if(arr[mid]>=search){
            return leftMostOccurence(arr, low, mid-1, search);
        }else {
            return leftMostOccurence(arr, mid + 1, high, search);
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 3, 3, 3, 3};
        System.out.println(leftMostOccurence(arr,0, arr.length -1, 3));
    }
}
