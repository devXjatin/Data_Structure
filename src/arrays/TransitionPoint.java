package arrays;

public class TransitionPoint {

    static int transitionPoint(int[] arr){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == 1){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 1};
        System.out.println(transitionPoint(arr));
    }
}
