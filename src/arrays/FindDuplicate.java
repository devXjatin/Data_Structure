package arrays;

public class FindDuplicate {

    //method to find duplicate in the array
    static int findDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            while (j < arr.length){
                if(i != j){
                    if(arr[i] == arr[j]){
                        return arr[i];
                    }
                }
                j++;
            }

        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        int [] arr = {2, 4, 5, 1, 2, 9};
        System.out.println(findDuplicate(arr));
    }
}
