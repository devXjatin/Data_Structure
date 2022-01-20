package arrays;

public class PutZeroesToEnd {
    static void putZeroesToEnd(int[] arr){
        int currentPos = 0;
        int nonZeroesPos = 0;
        while(currentPos != arr.length){
            if(arr[currentPos] !=0){
                int temp = arr[currentPos];
                arr[currentPos] = arr[nonZeroesPos];
                arr[nonZeroesPos] = temp;
                nonZeroesPos +=1;
            }
            currentPos+=1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 0, 5, 0, 6, 0, 1, 8 };
        putZeroesToEnd(arr);
        for(var val: arr){
            System.out.print(val+" ");
        }
    }
}
