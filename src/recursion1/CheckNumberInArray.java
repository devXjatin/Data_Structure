package recursion1;

public class CheckNumberInArray {
    static boolean checkNumber(int[] arr, int startIndex, int search){
        if(startIndex == arr.length){
            return false;
        }
        if(arr[startIndex] == search){
            return true;
        }
        return checkNumber(arr, startIndex+1, search);
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 5, 46, 30, 23};
        System.out.println(checkNumber(arr, 0, 40));
    }
}
