package arrays;

public class SecondLargest {

    static int secondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(largest< arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }else if(secondLargest < arr[i] && arr[i] != largest){
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 3, 9, 7};
        System.out.println(secondLargest(arr));
    }
}
