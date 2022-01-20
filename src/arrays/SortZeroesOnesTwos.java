package arrays;

public class SortZeroesOnesTwos {
    static void sortZeroesOnesTwos(int[] arr) {
        int current = 0;
        int zeroPos = 0;
        int twoPos = arr.length - 1;
        while (current <= twoPos) {
            if (arr[current] == 0) {
                int temp = arr[current];
                arr[current] = arr[zeroPos];
                arr[zeroPos] = temp;
                zeroPos+=1;
                current+=1;
            }else if(arr[current] == 2){

                int temp = arr[current];
                arr[current] = arr[twoPos];
                arr[twoPos] = temp;
                twoPos-=1;
            }else{
                current+=1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 1, 2};
        sortZeroesOnesTwos(arr);
        for(var val: arr){
            System.out.print(val+" ");
        }
    }
}
