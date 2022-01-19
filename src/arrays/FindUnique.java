package arrays;

public class FindUnique {
    //method to find unique in the array
    static int findUnique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for (; j < arr.length; j++) {
                if(i != j){
                    if (arr[i] == arr[j]){
                        break;
                    }
                }
            }
            if(j == arr.length){
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 3, 6, 2};
        System.out.println(findUnique(arr));
    }
}
