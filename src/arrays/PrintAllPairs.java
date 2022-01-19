package arrays;

public class PrintAllPairs {
    //method to print all pairs
    static void printAllPairs(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 6, 5};
        printAllPairs(arr);
    }
}
