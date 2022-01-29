package recursion1;

public class AllIndices {
    private static int[] allIndices(int[] arr, int startIndex, int search, int foundSoFar){
        if(startIndex == arr.length){
            return new int[foundSoFar];
        }
        if(arr[startIndex] == search){
            int[] indices = allIndices(arr, startIndex+1, search, foundSoFar+1);
            indices[foundSoFar] = startIndex+1;
            return indices;
        }else{
            int[] indices = allIndices(arr, startIndex+1, search, foundSoFar);
            return indices;
        }
    }

    static int[] allIndices(int[]arr, int search){
        return allIndices(arr, 0, search, 0);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,6,1,7};
        int[] indices = allIndices(arr, 0);
        for(var val: indices){
            System.out.print(val+" ");
        }
    }
}
