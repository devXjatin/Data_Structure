package arrays;

public class SortZeroesAndOnes {

    //method to sort zeroes and ones
    static void sortZeroesAndOnes(int[] arr){
        int zeroPos = 0;
        int current = 0;
        while (current < arr.length){
            if(arr[current] == 0){
                int temp = arr[current];
                arr[current] = arr[zeroPos];
                arr[zeroPos] = temp;
                zeroPos+=1;
            }
            current+=1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1};
        sortZeroesAndOnes(arr);
        for(var val: arr){
            System.out.print(val+" ");
        }
    }
}
